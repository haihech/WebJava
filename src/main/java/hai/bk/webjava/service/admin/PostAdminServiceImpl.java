package hai.bk.webjava.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hai.bk.webjava.dao.api.PostDAO;
import hai.bk.webjava.entity.LikeEntity;
import hai.bk.webjava.entity.PostEntity;

@Service
public class PostAdminServiceImpl implements PostAdminService{
	
	@Autowired
	PostDAO postDAO;

	@Override
	public List<PostEntity> listPostBrowse() {
		return postDAO.getListPostBrowse();
	}

	@Override
	public void confirmPost(int id) {
		postDAO.confirmPost(id);
	}

	@Override
	public void cancelPost(int id) {
		postDAO.cancelPost(id);
	}

	@Override
	public List<PostEntity> getTopLikePost(int limit) {
		return postDAO.getTopLikePost(limit);
	}

	@Override
	public void uploadPostHome(int limit) {
		postDAO.uploadPostHome(limit);
	}

}
