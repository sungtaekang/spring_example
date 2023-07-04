package com.example.lesson07.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString	// toString override 값 예쁘게 출력
@AllArgsConstructor	// 모든 필드를 인자값으로 받는 생성자
@NoArgsConstructor	// 파라미터 없는 기본 생성자
@Builder	// setter 대용
@Getter		// getter
@Table(name = "studentInfo")	// 테이블명에 언더바(_)가 붙어있을 때 꼭 추가한다.
@Entity	// 이 클래스는 Entity다
public class StudentEntity {
	@Id		// pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // auto increment
	private int id;
	
	private String name;
	
	@Column(name = "phoneNumber")	// 카멜케이스 필드인 경우 반드시 명시
	private String phoneNumber;
	
	private String email;
	
	@Column(name = "dreamJob")
	private String dreamJob;
	
	@UpdateTimestamp	// createdAt이 null이면 현재 시간으로 자동 입력
	@Column(name = "createdAt", updatable = false)	// updatable = false는 업데이트시 시간 갱신 안함
	private ZonedDateTime createdAt;
	
	@UpdateTimestamp
	@Column(name = "updatedAt")
	private ZonedDateTime updatedAt;
}
