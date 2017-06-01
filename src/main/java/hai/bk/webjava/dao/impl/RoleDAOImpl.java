package hai.bk.webjava.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import hai.bk.webjava.dao.api.RoleDAO;
import hai.bk.webjava.entity.DivideRoleEntity;

@Repository
@Transactional
public class RoleDAOImpl implements RoleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<DivideRoleEntity> listRole(String adminID) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(DivideRoleEntity.class, "div");
		
		// to define the inner join
		crit.createAlias("div.adminEntity", "admin");
		crit.add(Restrictions.eq("admin.id", adminID));
		
		@SuppressWarnings("unchecked")
		List<DivideRoleEntity> list = crit.list();
		return list;
		
//		return sessionFactory.getCurrentSession().createCriteria(DivideRoleEntity.class, "div")
//                .createAlias("div.adminEntity", "role")
//                .createAlias("div.roleEntity", "admin")
//                .add(Restrictions.eq("admin.id", adminID))
//                .list();
	}

	@Override
	public List<String> listRoleByAdminID(String adminID) {
		List<String> listResult = new ArrayList<>();
		List<DivideRoleEntity> list = this.listRole(adminID);
		
		if(list.size() > 0){
			for(DivideRoleEntity item : list){
				listResult.add(item.getRoleEntity().getId());
			}
		}
		
		return listResult;
	}
	

}
