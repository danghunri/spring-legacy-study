package com.hoon.spring_legacy_study.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TimeTests {
	@Autowired
	private  TimeMapper timeMapper;
	
	@Test
	public void test1() {
		log.info("----------------------------");
		log.info(timeMapper.getTime()); 
		log.info("----------------------------");
		log.info("----------------------------");
	}
	@Test
	public void test2() {
		log.info("----------------------------");
		log.info(timeMapper.getTime2()); 
		log.info("----------------------------");
		log.info("----------------------------");
	}

}
