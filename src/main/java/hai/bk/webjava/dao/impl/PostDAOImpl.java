package hai.bk.webjava.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hai.bk.webjava.dao.api.PostDAO;
import hai.bk.webjava.entity.CategoryEntity;
import hai.bk.webjava.entity.LikeEntity;
import hai.bk.webjava.entity.PostEntity;
import hai.bk.webjava.entity.UserEntity;

@Transactional
@Repository
public class PostDAOImpl implements PostDAO {

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

	@Override
	public void confirmPost(int id) {
		Session session = sessionFactory.getCurrentSession();
		PostEntity postEntity = this.getPostEntity(id);
		postEntity.setStatus(1);
		session.update(postEntity);
	}

	@Override
	public PostEntity getPostEntity(int id) {
		return (PostEntity) sessionFactory.getCurrentSession().get(PostEntity.class, id);
	}

	@Override
	public void cancelPost(int id) {
		Session session = sessionFactory.getCurrentSession();
		PostEntity postEntity = this.getPostEntity(id);
		// int userId = postEntity.getUserEntity().getId();
		// NotifyEntity notifyEntity = new NotifyEntity();
		// notifyEntity.setCheck(0);
		// notifyEntity.setMessage("Bài đăng mã "+ id + " của bạn đã bị xóa do
		// vi phạm quy định của diễn đàn.");
		// notifyEntity.setType("Vi pham");
		// notifyEntity.setLink("1");
		// notifyEntity.setUserId(userId);
		//
		// session.save(notifyEntity);
		session.delete(postEntity);

	}

	
	@Override
	public List<PostEntity> getTopLikePost(int limit) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(PostEntity.class, "post");
		crit.createAlias("post.userEntity", "user");
		crit.createAlias("post.categoryEntity", "cat");
		crit.add(Restrictions.eq("post.status", 1));
		crit.add(Restrictions.ge("post.likes", 1));
		crit.addOrder(Order.desc("post.likes"));
		crit.setMaxResults(limit);
		
		@SuppressWarnings("unchecked")
		List<PostEntity> list = crit.list();
		return list;
	}

	@Override
	public void uploadPostHome(int limit) {
		Session session = sessionFactory.getCurrentSession();
		List<PostEntity> list = this.getTopLikePost(limit);
		for(PostEntity postEntity : list){
			postEntity.setStatus(2);
			session.update(postEntity);
		}
	}

}
