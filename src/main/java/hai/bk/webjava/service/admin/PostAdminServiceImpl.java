package hai.bk.webjava.service.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hai.bk.webjava.dao.api.PostDAO;
import hai.bk.webjava.entity.PostEntity;
import hai.bk.webjava.model.Post;

@Service
public class PostAdminServiceImpl implements PostAdminService{
	
	@Autowired
	PostDAO postDAO;

	@Override
	public List<Post> listPostBrowse() {
		List<PostEntity> list = postDAO.getListPostBrowse();
		List<Post> listPost = new ArrayList<>();
		if(list != null && list.size() > 0){
			for(PostEntity postEntity : list){
				Post post = this.getPostInfo(postEntity);
				if(post != null)
					listPost.add(post);
			}
		}
		return listPost;
	}
	
	public Post getPostInfo(PostEntity postEntity) {

		Post post  = null;
        if (postEntity != null) {
            post = new Post(postEntity.getId(), postEntity.getUserEntity().getId(), postEntity.getCategoryEntity().getId(),
            		postEntity.getTitle(), postEntity.getViews(), postEntity.getStatus(), postEntity.getImg(), postEntity.getCreated_at(),
            		postEntity.getUpdated_at());
        }
        return post;
    }

}
