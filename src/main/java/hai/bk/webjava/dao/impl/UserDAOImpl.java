package hai.bk.webjava.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hai.bk.webjava.dao.api.UserDAO;
import hai.bk.webjava.entity.UserEntity;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserEntity findUser(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(UserEntity.class);
		crit.add(Restrictions.eq("id", id));
		return (UserEntity) crit.uniqueResult();
	}

}
