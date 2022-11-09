package com.bitc.board.mapper;

import com.bitc.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//mybatis(ibatis이지만 버전업해서 mybatis로바뀜)
// @Mapper : mybatis orm을 사용하여 xml파일과 연동된 인터페이스임을 알려주는 어노테이션
@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
}
