package guru.springframework.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokeapp.services.JokeService;

@Controller
public class JokeController {
	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	@RequestMapping({"/",""})
	public String getJokes(Model model) {
		model.addAttribute("jokes",jokeService.getJokes());
		return ("jokeapps");
	}

}
