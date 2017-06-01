package hai.bk.webjava.model;

import java.sql.Timestamp;

public class UserLike {
	private int id;
	private int userId;
	private int postId;
	private int type;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public UserLike(){}

	public UserLike(int id, int userId, int postId, int type) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
		this.type = type;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
