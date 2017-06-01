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

@Entity(name = "post")
public class PostEntity {
	private int id;
	private UserEntity userEntity;
	private CategoryEntity categoryEntity;
	private String title;
	private int views;
	private int status;
	private String img;
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
    foreignKey = @ForeignKey(name = "post_users_id_foreign") )
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false,
    foreignKey = @ForeignKey(name = "post_category_id_foreign") )
	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}
	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}
	
	@Column(name = "title", length = 255, nullable = false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name = "views", length = 11, nullable = false)
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	
	@Column(name = "status", length = 11, nullable = false)
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column(name = "img", length = 255, nullable = false)
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
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
