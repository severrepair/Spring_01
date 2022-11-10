package com.bitc.board.service;

import com.bitc.board.dto.BoardDto;

import java.util.List;

public interface BoardService {
    List<BoardDto> selectBoardList() throws Exception;

    BoardDto selectBoardDetail(int idx) throws Exception;

    void insertBoard(BoardDto board) throws Exception;

    void updateBoard(BoardDto board) throws Exception;

    void deleteBoard(int idx) throws Exception;
}
