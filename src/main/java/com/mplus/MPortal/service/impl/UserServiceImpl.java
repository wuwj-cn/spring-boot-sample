package com.mplus.MPortal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mplus.MPortal.model.User;
import com.mplus.MPortal.repository.UserRepository;
import com.mplus.MPortal.service.UserService;
import com.mplus.core.service.BaseServiceImpl;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, String> implements UserService {

	@Autowired private UserRepository userRepository;

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	
}
