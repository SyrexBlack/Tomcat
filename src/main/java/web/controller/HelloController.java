package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping("/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Привет!");
		messages.add("Я родился!");
		messages.add("Это было подло выносить Webapp из Main :)");
		model.addAttribute("messages", messages);
		return "index";
	}
}
