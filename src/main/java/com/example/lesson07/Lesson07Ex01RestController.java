package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex01")
@RestController
public class Lesson07Ex01RestController {
	// CUD
	
	@Autowired
	private StudentBO studentBO;
	
	// C:Create
	@GetMapping("/1")
	public StudentEntity create() {
		String name = "강승원";
		String phoneNumber = "010-2222-3333";
		String email = "seaso@nate.com";
		String dreamJob = "개발자";
		
		StudentEntity student = studentBO.addStudent(name, phoneNumber, email, dreamJob);
		return student;	// @ResponseBody + return 객체 => JSON
	}
	
	// U:Update
	@GetMapping("/2")
	public StudentEntity update() {
		// id가 4번인 dreamJob을 변경 => "개인투자자"
		StudentEntity student = studentBO.updateStudentDreamJobById(4, "개인투자자");
		
		return student;
	}
	
	// D:Delete
	@GetMapping("/3")
	public String delete() {
		// id:4
		studentBO.deleteStudentById(4);
		return "삭제 완료";
	}
}
