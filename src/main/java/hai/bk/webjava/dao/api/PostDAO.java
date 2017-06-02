package hai.bk.webjava.dao.api;

import java.util.List;

import hai.bk.webjava.entity.LikeEntity;
import hai.bk.webjava.entity.PostEntity;


public interface PostDAO {
	public List<PostEntity> getListPostBrowse();
	public void confirmPost(int id);
	public void cancelPost(int id);
	public PostEntity getPostEntity(int id);
	public List<PostEntity> getTopLikePost(int limit);
	public void uploadPostHome(int limit);
}
