package com.example.service;

import java.util.List;

import com.example.model.tb_user;

public interface IUserService {
	 public tb_user insertUser(tb_user user);
	 public tb_user updateUser(int Id,tb_user user);
	 public tb_user deleteUser(int Id);
	 public tb_user getIdUser(int Id);
	 public List<tb_user> getAllUser();
	 public tb_user loginUser(tb_user user);
	 public tb_user registerUser(tb_user user);
}
