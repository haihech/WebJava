package hai.bk.webjava.controller.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hai.bk.webjava.entity.LikeEntity;
import hai.bk.webjava.entity.PostEntity;
import hai.bk.webjava.service.admin.PostAdminService;

@Controller
public class PostAdminController {

	@Autowired
	PostAdminService post;
	
	@RequestMapping(value = "/admin/list-post-browse", method = RequestMethod.GET)
	public String listPostBrowse(Model model){
		List<PostEntity> listPost = post.listPostBrowse();
		model.addAttribute("listPost", listPost);
		return "admin/post/post_browse";
	}
	
	@RequestMapping(value = "admin/confirm-post/{id}", method = RequestMethod.GET)
	public String confirmPost(Model model, @PathVariable int id){
		post.confirmPost(id);
		model.addAttribute("listPost", post.listPostBrowse());
		return "admin/post/table_post_browse";
		
	}
	
	@RequestMapping(value = "admin/cancel-post/{id}", method = RequestMethod.GET)
	public String cancelPost(Model model, @PathVariable int id){
		post.cancelPost(id);
		model.addAttribute("listPost", post.listPostBrowse());
		return "admin/post/table_post_browse";
		
	}
	
	
	@RequestMapping(value = "/admin/list-post-home", method = RequestMethod.GET)
	public String listPostHome(Model model){
		List<PostEntity> listPost = post.getTopLikePost(5);
		model.addAttribute("listPost", listPost);
		return "admin/post/post_home";
	}
	
	@RequestMapping(value = "/admin/upload-home-page/{limit}", method = RequestMethod.GET)
	public String uploadPostHome(Model model, @PathVariable int limit){
		post.uploadPostHome(limit);
		model.addAttribute("listPost", new ArrayList<>());
		return "admin/post/post_home";
		
		//return "redirect:/admin/list-post-home";
	}
}
