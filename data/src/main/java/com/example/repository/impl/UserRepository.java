package com.example.repository.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//import com.example.model.tb_kartuKeluarga;
import com.example.model.tb_user;
import com.example.repository.IUserRepository;
@Repository
public class UserRepository implements IUserRepository{
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public tb_user insertUser(tb_user user) {
		// TODO Auto-generated method stub
		String query ="INSERT INTO tb_user(email,nama,password)"
				+" VALUES(?,?,?)";
		jdbcTemplate.update(query,new Object[] {user.getEmail(),user.getNama(),user.getPassword()});
		return user;
	}

	@Override
	public tb_user updateUser(int Id, tb_user user) {
		// TODO Auto-generated method stub
		String query =" UPDATE tb_user SET email = ?,nama = ?,password = ?,jenis_kelamin  = ?,nama = ? WHERE id = ?";
		jdbcTemplate.update(query,new Object[] {user.getEmail(),user.getNama(),user.getPassword(),Id});
		
		return user;
	}

	@Override
	public tb_user deleteUser(int Id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_user WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(tb_user.class), Id);
		query = " DELETE FROM tb_user WHERE id = ?";
		jdbcTemplate.update(query, Id);
		return result;
	}

	@Override
	public tb_user getIdUser(int Id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_user WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(tb_user.class), Id);
		return result;
	}



	@Override
	public tb_user loginUser(tb_user user) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_user WHERE email =? AND password = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(tb_user.class), user.getEmail() , user.getPassword());
		return result;
	}

	@Override
	public List<tb_user> getAllUser() {
		String query = "SELECT * FROM tb_user";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(tb_user.class));
	}

	@Override
	public tb_user registerUser(tb_user user) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_user(email,nama,password)"+"VALUES(?,?,?)";
		jdbcTemplate.update(query,new Object[] {user.getEmail(),user.getNama(),user.getPassword()});
		return user;
	}
	

}
