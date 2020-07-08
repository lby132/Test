package com.freehoon.web.user.service;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freehoon.web.user.dao.UserDAO;
import com.freehoon.web.user.model.UserVO;
@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<UserVO> getUserList() throws Exception {
		// TODO Auto-generated method stub
		return userDAO.getUserList();
	}

	@Override
	public UserVO getUserInfo(String uid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserVO userVO) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String uid) throws Exception {
		// TODO Auto-generated method stub

	}

}
