package hai.bk.webjava.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hai.bk.webjava.dao.api.PostDAO;
import hai.bk.webjava.entity.PostEntity;

@Transactional
@Repository
public class PostDAOImpl implements PostDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PostEntity> getListPostBrowse() {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(PostEntity.class, "post");
		crit.createAlias("post.userEntity", "user");
		crit.createAlias("post.categoryEntity", "cat");
		crit.add(Restrictions.eq("post.status", 0));
		
		@SuppressWarnings("unchecked")
		List<PostEntity> list = crit.list();
		return list;
	}


}
