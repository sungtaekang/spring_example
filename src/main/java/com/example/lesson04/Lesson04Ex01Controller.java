package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.domain.User;

@RequestMapping("/lesson04/ex01")
@Controller		// jsp view 뿌리기 위해서 @ResponseBody 있으면 안됨!
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
	// _view
	@RequestMapping(path = "/add_user_view", method = RequestMethod.GET)
	public String addUserView() {
		// /WEB-INF/jsp/ lesson04/addUser		.jsp
		return "lesson04/addUser";
	}
	
	@PostMapping("/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// DB에 insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		// 결과 페이지
		return "lesson04/afterAddUser";
	}
	
	@GetMapping("/get_latest_user_view")
	public String getLatestUserView(Model model) { // Model: view 화면에서 데이터를 사용할 수 있도록 담는 객체
		// DB select - 가장 최근에 추가된 사람 한명 가져오기
		User user = userBO.getLatestUser();
		model.addAttribute("result", user);
		model.addAttribute("title", "회원 정보");
		
		// 결과 페이지
		return "lesson04/getLatestUser";
	}
}
