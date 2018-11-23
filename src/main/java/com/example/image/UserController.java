package com.example.image;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	private final SiteUserRepository siteUserRepository;

	public UserController(SiteUserRepository siteUserRepository) {
		this.siteUserRepository = siteUserRepository;
	}

	@GetMapping("/register")
	public String register(Model model, SiteUserForm siteUserForm) {
		return "register";
	}

	@PostMapping("/register")
	public String register(Model model, SiteUser siteUser, SiteUserForm siteUserForm, BindingResult result) {
		
		if (siteUserForm.getName().matches("^[a-zA-Z0-9]{3,}$")){
			siteUser = new SiteUser(siteUserForm.getName().trim(), 
					new BCryptPasswordEncoder().encode(siteUserForm.getPassword()), true);
		}
		else {
			result.rejectValue("name", "username");
			return "register";
		}

		try {
			this.siteUserRepository.save(siteUser);
		} catch(DataIntegrityViolationException ex){
			ex.printStackTrace();
			result.rejectValue("name", "name");
			return "register";
		}

		return "redirect:/login";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model){
		model.addAttribute("users", siteUserRepository.findAll());
		return "users";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
