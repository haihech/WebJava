package hai.bk.webjava.controller.admin;

import java.security.Principal;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hai.bk.webjava.service.admin.AdminService;

@Controller
public class LoginAdminController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "admin/login";
	}
	
	@RequestMapping(value = "/admin/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request) {
		request.getSession().removeAttribute("username");
		request.getSession().removeAttribute("listRole");
		return "admin/login";
	}

	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String homePage(Model model, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		String username = principal.getName();
		String u = (String) request.getSession().getAttribute("username");
		if(u != null){
			request.getSession().removeAttribute("username");
			request.getSession().removeAttribute("listRole");
		}
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("listRole", adminService.getListRole(username));
		return "admin/home";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "admin/403Page";
	}
}
