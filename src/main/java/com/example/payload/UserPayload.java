package com.example.payload;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserPayload {

	private String firstName;

	private String lastName;

	private String email;

	private String phoneNum;

	private String password;

	private LocalDateTime creatdAt;
	private LocalDateTime updateAt;

}
