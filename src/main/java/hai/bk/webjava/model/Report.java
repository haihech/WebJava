package hai.bk.webjava.model;

import java.sql.Timestamp;

public class Report {
	private int id;
	private int userId;
	private int postId;
	private String type;
	private String reason;
	private int status;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Report(){}

	public Report(int id, int userId, int postId, String type, String reason, int status, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
		this.type = type;
		this.reason = reason;
		this.status = status;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
