package hai.bk.webjava.service.admin;

import java.util.List;

import hai.bk.webjava.entity.LikeEntity;
import hai.bk.webjava.entity.PostEntity;

public interface PostAdminService {

	public List<PostEntity> listPostBrowse();
	public void confirmPost(int id);
	public void cancelPost(int id);
	
	public List<PostEntity> getTopLikePost(int limit);
	
	public void uploadPostHome(int limit);
}
