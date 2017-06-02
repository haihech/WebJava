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

@Entity(name = "user_like")
public class LikeEntity {
	private int id;
	private UserEntity userEntity;
	private PostEntity postEntity;
	private int postId;
	private int type;
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
    foreignKey = @ForeignKey(name = "user_like_users_id_foreign") )
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false, unique = true, insertable = false, updatable = false,
    foreignKey = @ForeignKey(name = "user_like_post_id_foreign") )
	public PostEntity getPostEntity() {
		return postEntity;
	}
	public void setPostEntity(PostEntity postEntity) {
		this.postEntity = postEntity;
	}
	
	@Column(name = "type", length = 11, nullable = false)
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	
	@Column(name = "post_id", nullable = false)
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	
	
	
	
}
