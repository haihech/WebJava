package hai.bk.webjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="quyen")
public class RoleEntity {
	private String id;
	private String roleName;
	
	@Id
	@Column(name = "id", length = 255, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "tenquyen", length = 255, nullable = false)
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
