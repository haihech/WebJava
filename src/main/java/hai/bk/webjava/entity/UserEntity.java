package hai.bk.webjava.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "users")
public class UserEntity {
	private int id;
	private String idFb;
	private String email;
	private String nickName;
	private String userName;
	private String password;
	private String avatar;
	private int status;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", length = 10, unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "id_fb", length = 255, nullable = true)
	public String getIdFb() {
		return idFb;
	}
	public void setIdFb(String idFb) {
		this.idFb = idFb;
	}
	
	@Column(name = "email", length = 255, nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "nickname", length = 255, nullable = true)
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Column(name = "username", length = 255, nullable = true)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "password", length = 255, nullable = true)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "avatar", length = 255, nullable = true)
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	@Column(name = "status", length = 11, nullable = false)
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column(name = "created_at", nullable = true)
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	
	@Column(name = "updated_at", nullable = true)
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	
}
