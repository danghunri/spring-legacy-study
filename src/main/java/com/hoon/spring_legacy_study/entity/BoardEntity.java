package com.hoon.spring_legacy_study.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardEntity {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
}
