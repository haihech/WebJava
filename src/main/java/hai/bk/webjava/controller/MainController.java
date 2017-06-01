package hai.bk.webjava.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "admin/login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String homePage(Model model, HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		model.addAttribute("username", principal.getName());
		return "admin/index";
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
