package com.example.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.tb_kartuKeluarga;
import com.example.repository.IKartuKeluargaRepository;
@Repository
public class KartuKeluargaRepository implements IKartuKeluargaRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public tb_kartuKeluarga insertKK(tb_kartuKeluarga KK) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_kartu_keluarga (alamat,desa_kelurahan,kabupaten_kota,kecamatan,kode_post,nomer_kk,provinsi,rt,rw)"
				+" VALUES (?,?,?,?,?,?,?,?,?) ";
		jdbcTemplate.update(query,new Object[] {KK.getAlamat(),KK.getDesa_kelurahan(),KK.getKabupaten_kota(),KK.getKecamatan(),
				KK.getKode_post(),KK.getNomer_kk(),KK.getProvinsi(),KK.getRt(),KK.getRw()
		});
		return KK;
	}

	@Override
	public tb_kartuKeluarga updateKK(int Id, tb_kartuKeluarga KK) {
		// TODO Auto-generated method stub
		String query =" UPDATE tb_kartu_keluarga SET alamat  = ?,desa_kelurahan = ?,kabupaten_kota = ?,kecamatan= ?,kode_post =?,nomer_kk = ?,"
				+ " provinsi = ?,rt =?, rw =? WHERE id = ?";
		jdbcTemplate.update(query,new Object[] {KK.getAlamat(),KK.getDesa_kelurahan(),KK.getKabupaten_kota(),KK.getKecamatan(),
				KK.getKode_post(),KK.getNomer_kk(),KK.getProvinsi(),KK.getRt(),KK.getRw(), Id
		});
		
		return KK;
	}

	@Override
	public tb_kartuKeluarga deleteKK(int Id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(tb_kartuKeluarga.class), Id);
		query = " DELETE FROM tb_kartu_keluarga WHERE id = ?";
		jdbcTemplate.update(query, Id);
		return result;
	}

	@Override
	public tb_kartuKeluarga getIdKK(int Id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(tb_kartuKeluarga.class), Id);
		return result;
	}

	@Override
	public List<tb_kartuKeluarga> getAllKK() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(tb_kartuKeluarga.class));
	
	}

}
