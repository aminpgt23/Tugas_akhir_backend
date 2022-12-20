package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.tb_anggotaKeluarga;
import com.example.repository.IAnggotaKeluargaRepository;
import com.example.service.IAnggotaKeluargaService;
@Service
public class AnggotaKeluargaService implements IAnggotaKeluargaService{
	@Autowired
	 IAnggotaKeluargaRepository anggotakeluargaRepository;

	@Override
	public tb_anggotaKeluarga insertKK(tb_anggotaKeluarga anggotakeluarga) {
		// TODO Auto-generated method stub
		return  anggotakeluargaRepository.insertKK(anggotakeluarga);
	}

	@Override
	public tb_anggotaKeluarga updateKK(int Id, tb_anggotaKeluarga anggotakeluarga) {
		// TODO Auto-generated method stub
		return  anggotakeluargaRepository.updateKK(Id, anggotakeluarga);
	}

	@Override
	public tb_anggotaKeluarga deleteKK(int Id) {
		// TODO Auto-generated method stub
		return  anggotakeluargaRepository.deleteKK(Id);
	}

	@Override
	public tb_anggotaKeluarga getIdKK(int Id) {
		// TODO Auto-generated method stub
		return  anggotakeluargaRepository.getIdKK(Id);
	}

	@Override
	public List<tb_anggotaKeluarga> getAllKK() {
		// TODO Auto-generated method stub
		return  anggotakeluargaRepository.getAllKK();
	}

	@Override
	public List<tb_anggotaKeluarga> getIdKK(String id_kk) {
		// TODO Auto-generated method stub
		return anggotakeluargaRepository.getIdKK(id_kk);
	}

	@Override
	public List<tb_anggotaKeluarga> deleteIdKK(String id_kk) {
		// TODO Auto-generated method stub
		return anggotakeluargaRepository.deleteIdKK(id_kk);
	}


}
