package hai.bk.webjava.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hai.bk.webjava.dao.api.AdminDAO;
import hai.bk.webjava.entity.AdminEntity;

@Repository
@Transactional
public class AdminDAOImpl implements AdminDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public AdminEntity findAdmin(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(AdminEntity.class);
		crit.add(Restrictions.eq("id", id));
		return (AdminEntity) crit.uniqueResult();
	}

}
