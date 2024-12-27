package com.hoon.spring_legacy_study.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoon.spring_legacy_study.entity.BoardEntity;
import com.hoon.spring_legacy_study.mappers.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
@Transactional
public class BoardService {
	private final BoardMapper boardMapper;

	public Long register(BoardEntity board) {
		log.info("register...." + board);

		boardMapper.insert(board);
		return board.getBno();
	}

	public List<BoardEntity> list() {
		log.info("list....");
		return boardMapper.getList();
	}
	
	public boolean modify(BoardEntity board) {
		log.info("modify...." + board);
		return boardMapper.update(board) == 1;
	}
	
	public boolean remove(Long bno) {
		return true;
	}
}
