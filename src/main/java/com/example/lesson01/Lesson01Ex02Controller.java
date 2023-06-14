package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// JSP 화면 뿌리기
@Controller		// RestController 아님 주의!!, ResponseBody X
public class Lesson01Ex02Controller {

	// http://localhost/lesson01/ex02
	@RequestMapping("/lesson01/ex02")
	public String ex02() {
		// jsp의 경로를 리턴한다.
		// 	"/WEB-INF/jsp/		.jsp"		
//		return "/WEB-INF/jsp/lesson01/ex02.jsp"; // jsp 경로
		return "lesson01/ex02"; // jsp 경로
	}
}
