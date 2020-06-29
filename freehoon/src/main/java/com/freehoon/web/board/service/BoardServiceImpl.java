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

	//       boardVO = boardDAO.getBoardContent(bid);            <= ���� �󼼳��� ��ȸ �κ��� �ּ� ó�� �մϴ�.

	// Cate_cd�� �÷����� ������ �� �ִ� ũ�⺸�� ū ���ڿ��� �����ϵ��� ������ �ϰ� �Խù� ���� ������ ȣ�� �մϴ�.

  // ���� ���� SQL �� ó���� ������ �߻��ϰ� �˴ϴ�.

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
