package hai.bk.webjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "phanquyen")
public class DivideRoleEntity {
	private int id;
	
	private AdminEntity adminEntity;
	private RoleEntity roleEntity;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", length = 10, unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// fetch = FetchType.LAZY: chỉ load các admin cần thiết
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false, unique = true,
    foreignKey = @ForeignKey(name = "phanquyen_admin_id_foreign") )
	public AdminEntity getAdminEntity() {
		return adminEntity;
	}
	public void setAdminEntity(AdminEntity adminEntity) {
		this.adminEntity = adminEntity;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quyen_id", nullable = false, foreignKey = @ForeignKey(name = "phanquyen_quyen_id_foreign"))
	public RoleEntity getRoleEntity() {
		return roleEntity;
	}
	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}
	
	
	
}
