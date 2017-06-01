package hai.bk.webjava.model;

import java.sql.Timestamp;

public class Notification {
	private int id;
	private int check;
	private String message;
	private String type;
	private String link;
	private int user_id;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Notification(){}

	public Notification(int id, int check, String message, String type, String link, int user_id, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.check = check;
		this.message = message;
		this.type = type;
		this.link = link;
		this.user_id = user_id;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
