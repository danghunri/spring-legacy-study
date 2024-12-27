package com.hoon.spring_legacy_study.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hoon.spring_legacy_study.entity.BoardEntity;

@Mapper
public interface BoardMapper {
	List<BoardEntity> getList();
	
	int insert(BoardEntity board);
	
	BoardEntity select(Long bno);
	
	int update(BoardEntity board);
}
