package hai.bk.webjava.model;

import java.sql.Timestamp;

public class UserComment {
	private int id;
	private int userId;
	private int postId;
	private String comment;
	private String index;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public UserComment() {
	}

	public UserComment(int id, int userId, int postId, String comment, String index, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
		this.comment = comment;
		this.index = index;
		this.created_at = created_at;
		this.updated_at = updated_at;
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

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
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
