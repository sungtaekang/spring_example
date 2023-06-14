package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller		// Spring bean
public class Lesson01Ex01Controller {

	// return String => HTML
	// http://localhost:8080/lesson01/ex01/1
	@ResponseBody		// 리턴되는 값이 HTML Response에 담긴다.
	@RequestMapping("/1")		// 주소 매핑
	public String ex01_1() {
		String text = "예제1번<br> 문자열을 response body로 보내는 예제";
		return text;
	}
	
	// return Map => JSON String
	// http://localhost:8080/lesson01/ex01/2
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 4);
		map.put("포도", 16);
		map.put("망고", 50);
		map.put("블루베리", 412);
		
		// {"키"=값} => JAVA Map
		// map을 리턴하면 JSON으로 나타난다. web starter 안에 jackson 라이브러리가 있기 때문
		return map;
	}
}
