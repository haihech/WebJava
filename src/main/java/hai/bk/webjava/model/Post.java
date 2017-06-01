package hai.bk.webjava.model;

import java.sql.Timestamp;

public class Post {
	private int id;
	private int userId;
	private int categoryId;
	private String title;
	private int views;
	private int status;
	private String img;
	private Timestamp created_at;
	private Timestamp updated_at;
	
	public Post(){}

	public Post(int id, int userId, int categoryId, String title, int views, int status, String img, Timestamp created_at,
			Timestamp updated_at) {
		super();
		this.id = id;
		this.userId = userId;
		this.categoryId = categoryId;
		this.title = title;
		this.views = views;
		this.status = status;
		this.img= img;
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
