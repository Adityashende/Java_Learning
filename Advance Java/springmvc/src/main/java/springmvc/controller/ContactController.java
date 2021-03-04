package springmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("Header", "Team");
		m.addAttribute("Desc", "This is contact form");

	}

	@RequestMapping("/contact")
	public String showForm(Model m) {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model m) {

		this.userService.createUser(user);
		
		int createdUser=this.userService.createUser(user);
		m.addAttribute("msg","User created Successfully"+ createdUser);

		System.out.println(user);

		// model.addAttribute(user);
//		System.out.println("Email"+email+","+"Name"+username);
//		model.addAttribute("name",username);
//		model.addAttribute("email",email);
		return "success";
	}

}
