package com.hoon.spring_legacy_study.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardServiceTests {
	@Autowired
	BoardService boardService;
	
	@Test
	void testList() {
		log.info(boardService.list());
	}
}
