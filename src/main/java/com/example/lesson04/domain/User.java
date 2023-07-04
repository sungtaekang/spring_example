package com.example.lesson04.domain;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private int id;
	private String name;
	private String yyyymmdd;
	private String email;
	private String introduce;
	private Date createdAt;
	private Date updatedAt;
}
