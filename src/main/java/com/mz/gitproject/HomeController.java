package com.mz.gitproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		// 브랜치 1 에서 작업한 사항 ㅋㅋ
		return "NewFile";
	}
	
}
