package hai.bk.webjava.model;

public class DivideRole {
	private int id;
	private String roleId;
	private String adminId;
	
	public DivideRole(){}

	public DivideRole(int id, String roleId, String adminId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.adminId = adminId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	
}
