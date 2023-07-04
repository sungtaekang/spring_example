package com.example.lesson04.bo;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.StudentMapper;
import com.example.lesson04.domain.Student;
import com.example.lesson07.dao.StudentRepository;
import com.example.lesson07.entity.StudentEntity;

@Service
public class StudentBO {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	
	public Student getStudentById(int id) {
		return studentMapper.selectStudentById(id);
	}
	
	public StudentEntity addStudent(String name, String phoneNumber, String email, String dreamJob) {
		StudentEntity student = studentRepository.save(
					StudentEntity
					.name(name)
					.phoneNumber(phoneNumber)
					.email(email)
					.dreamJob(dreamJob)
					.createdAt(ZonedDateTime.now())  // @UpdateTimestamp 생략가능
					.build()
				);
		return student;
	}
}
