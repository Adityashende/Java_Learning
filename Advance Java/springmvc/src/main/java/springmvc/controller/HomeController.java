package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Hello!!!");
		model.addAttribute("name","Aditya Shende");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("About");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Shende");
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
