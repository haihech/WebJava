package hai.bk.webjava.model;

import java.sql.Timestamp;

public class UserLikeComment {
	private int id;
	private int userId;
	private int userCommentId;
	private Timestamp created_at;
	private Timestamp updated_at;

	public UserLikeComment() {
	}

	public UserLikeComment(int id, int userId, int userCommentId) {
		super();
		this.id = id;
		this.userId = userId;
		this.userCommentId = userCommentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserCommentId() {
		return userCommentId;
	}

	public void setUserCommentId(int userCommentId) {
		this.userCommentId = userCommentId;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

}
