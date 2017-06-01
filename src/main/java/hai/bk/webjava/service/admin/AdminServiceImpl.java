package hai.bk.webjava.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hai.bk.webjava.dao.api.RoleDAO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private RoleDAO roleDAO;

	@Override
	public List<String> getListRole(String id) {
		return roleDAO.listRoleByAdminID(id);
	}

}
