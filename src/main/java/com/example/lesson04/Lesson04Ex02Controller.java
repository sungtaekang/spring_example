package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
	
	@Autowired
	private StudentBO studentBO;

	// 학생 추가하는 페이지
	@GetMapping("/add_student_view")
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	// 학생 추가 => 방금 가입된 학생 정보 페이지
	@PostMapping("/add_student")
	public String addStudent(
			@ModelAttribute Student student, // jsp name 속성명과 필드명이 일치하는 곳에 세팅된다.
			Model model) {
		
		// insert DB
		studentBO.addStudent(student);		// 방금 인서트 된 id가 student 객체에 세팅된다.
		// student.getId();
		
		// select DBs
		Student latestStudent = studentBO.getStudentById(student.getId());
		model.addAttribute("result", latestStudent);
		
		return "lesson04/afterAddStudent";
	}
}
