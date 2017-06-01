package hai.bk.webjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "users_subcomments")
public class SubCommentEntity {

	private int id;
	private CommentEntity commentEntity;
	private CommentEntity subCommentEntity;
	
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
    @JoinColumn(name = "users_comments_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "users_subcomments_users_comments_id_foreign") )
	public CommentEntity getCommentEntity() {
		return commentEntity;
	}
	public void setCommentEntity(CommentEntity commentEntity) {
		this.commentEntity = commentEntity;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_subcomments_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "users_subcomments_users_subcomments_id_foreign") )
	public CommentEntity getSubCommentEntity() {
		return subCommentEntity;
	}
	public void setSubCommentEntity(CommentEntity subCommentEntity) {
		this.subCommentEntity = subCommentEntity;
	}
	
	
}
