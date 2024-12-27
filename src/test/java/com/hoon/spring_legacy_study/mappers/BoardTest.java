package com.hoon.spring_legacy_study.mappers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.hoon.spring_legacy_study.entity.BoardEntity;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class BoardTest {
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	void test1() {
		log.info(boardMapper);
	}
	
	@Test
	void test2() {
		boardMapper.getList().forEach(board -> log.info(board));
	}
	
	@Test
	void test3() {
		BoardEntity board = new BoardEntity();
		board.setTitle("new2 title");
		board.setContent("new2 content");
		board.setWriter("new2 writer");
		
		int i= boardMapper.insert(board);
		log.info("create id : " + board.getBno());
	}
	
	@Test
	void test4() {
		BoardEntity board = boardMapper.select(1L);
		log.info(board);
	}
	
	@Test
	void test5() {
		BoardEntity board = boardMapper.select(1L);
		board.setTitle("update title");
		board.setContent("update content");
		int i = boardMapper.update(board);
		log.info("update result : " + i);
	}
}
