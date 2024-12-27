package com.hoon.spring_legacy_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@Log4j2
public class SpringLegacyStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLegacyStudyApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("start SPRING1!!");
	}
}
