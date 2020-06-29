package com.freehoon.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.freehoon.web.board.dao.BoardDAO;
import com.freehoon.web.board.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}

	@Override

	public BoardVO getBoardContent(int bid) throws Exception{

		BoardVO boardVO = new BoardVO();

		boardDAO.updateViewCnt(bid);

	//       boardVO = boardDAO.getBoardContent(bid);            <= 기존 상세내역 조회 부분은 주석 처리 합니다.

	// Cate_cd에 컬럼에서 저장할 수 있는 크기보다 큰 문자열을 저장하도록 셋팅을 하고 게시물 수정 로직을 호출 합니다.

  // 따라서 수정 SQL 문 처리시 문제가 발생하게 됩니다.

    boardVO.setBid(bid);

		boardVO.setCate_cd("1111111111111111111111111111111111111");   

		boardDAO.updateBoard(boardVO);

 

		return boardVO;

	}




	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		boardDAO.updateBoard(boardVO);
		
	}

	@Override
	public void deleteBoard(int bid) throws Exception {
		boardDAO.deleteBoard(bid);
	}

}
