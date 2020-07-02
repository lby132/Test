package com.freehoon.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.freehoon.common.Pagination;
import com.freehoon.common.Search;
import com.freehoon.web.board.dao.BoardDAO;
import com.freehoon.web.board.model.BoardVO;
import com.freehoon.web.error.controller.NotFoundException;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO boardDAO;

	@Override

	public List<BoardVO> getBoardList(Search search) throws Exception {

		return boardDAO.getBoardList(search);

	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);
	}
	
	//@Transactional
	@Override

	public BoardVO getBoardContent(int bid) throws Exception{

		BoardVO boardVO = new BoardVO();

		 

		boardDAO.updateViewCnt(bid);

		boardVO = boardDAO.getBoardContent(bid);        //�ּ��� Ǯ�� �ݴϴ�.

		
		  // ����ó�� �׽�Ʈ�� �������Ƿ� �Ʒ� ������ ���� �ϰų� �ּ� ó�� �մϴ�.
		  
//		   try {
//		  
//		   boardVO.setBid(bid);
//		  
//		   boardVO.setCate_cd("1111111111111111111111111111111111111");
//		  
//		   boardDAO.updateBoard(boardVO);
//		  
//		   } catch (RuntimeException e) {
//		  
//		   throw new NotFoundException();
//		  
//		   }
		 


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

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return boardDAO.getBoardListCnt(search);
	}

	
}
