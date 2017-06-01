package hai.bk.webjava.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="admin")
public class AdminEntity {

	private String id;
	private String password;
	private String name;
	
	@Id
	@Column(name = "id", length = 255, nullable = false)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "password", length = 255, nullable = false)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "name", length = 255, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
