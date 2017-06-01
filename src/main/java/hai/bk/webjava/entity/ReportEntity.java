package hai.bk.webjava.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "report")
public class ReportEntity {
	private int id;
	private UserEntity userEntity;
	private PostEntity postEntity;
	private String type;
	private String reason;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "report_users_id_foreign") )
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "report_post_id_foreign") )
	public PostEntity getPostEntity() {
		return postEntity;
	}
	public void setPostEntity(PostEntity postEntity) {
		this.postEntity = postEntity;
	}
	
	@Column(name = "type", length = 255, nullable = false)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name = "reason", length = 255, nullable = false)
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
