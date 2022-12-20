package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.tb_user;
import com.example.repository.IUserRepository;
import com.example.service.IUserService;
@Service
public class UserService  implements IUserService{

	@Autowired
	 IUserRepository userRepository;

	@Override
	public tb_user insertUser(tb_user user) {
		// TODO Auto-generated method stub
		return userRepository.insertUser(user);
	}

	@Override
	public tb_user updateUser(int Id, tb_user user) {
		// TODO Auto-generated method stub
		return userRepository.updateUser(Id, user);
	}

	@Override
	public tb_user deleteUser(int Id) {
		// TODO Auto-generated method stub
		return userRepository.deleteUser(Id);
	}

	@Override
	public tb_user getIdUser(int Id) {
		// TODO Auto-generated method stub
		return userRepository.getIdUser(Id);
	}

	@Override
	public List<tb_user> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.getAllUser();
	}

	@Override
	public tb_user loginUser(tb_user user) {
		// TODO Auto-generated method stub
		return userRepository.loginUser(user);
	}

	@Override
	public tb_user registerUser(tb_user user) {
		// TODO Auto-generated method stub
		return userRepository.registerUser(user);
	}
	
	

}
