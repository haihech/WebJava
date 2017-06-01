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

@Entity(name = "users_like_comments")
public class LikeCommentEntity {
	private int id;
	private UserEntity userEntity;
	private CommentEntity commentEntity;
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
    foreignKey = @ForeignKey(name = "users_like_comments_users_id_foreign") )
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_comments_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "users_like_comments_users_comments_id_foreign") )
	public CommentEntity getCommentEntity() {
		return commentEntity;
	}
	public void setCommentEntity(CommentEntity commentEntity) {
		this.commentEntity = commentEntity;
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
