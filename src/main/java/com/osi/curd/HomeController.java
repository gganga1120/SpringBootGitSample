package com.osi.curd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welocmeGit")
	public String welocmeGit() {
		return "welocmeGitHub";
	}
}

