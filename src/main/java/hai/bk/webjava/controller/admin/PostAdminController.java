package hai.bk.webjava.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hai.bk.webjava.model.Post;
import hai.bk.webjava.service.admin.PostAdminService;

@Controller
public class PostAdminController {

	@Autowired
	PostAdminService postService;
	
	@RequestMapping(value = "/admin/list-post-browse", method = RequestMethod.GET)
	public String listPostBrowse(Model model){
		List<Post> listPost = postService.listPostBrowse();
		model.addAttribute("listPost", listPost);
		return "admin/post/post_browse";
	}
}
