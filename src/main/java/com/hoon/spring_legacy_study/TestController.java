package com.hoon.spring_legacy_study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hoon.spring_legacy_study.mappers.TimeMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequiredArgsConstructor
public class TestController {
	private final TimeMapper timeMapper;
	
	@GetMapping("/hello")
	public void hello() {
		log.info("Hello!!!!");
		 log.error("current time : {}", timeMapper.getTime());
//		return "hello";
	}
	
}
