package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.tb_kartuKeluarga;
import com.example.repository.IKartuKeluargaRepository;
import com.example.service.IKartuKeluargaService;
@Service
public class KartuKeluargaService implements IKartuKeluargaService{
	
	@Autowired
	 IKartuKeluargaRepository KKRepository;
	
	@Override
	public tb_kartuKeluarga insertKK(tb_kartuKeluarga KK) {
		// TODO Auto-generated method stub
		return KKRepository.insertKK(KK);
	}

	@Override
	public tb_kartuKeluarga updateKK(int Id, tb_kartuKeluarga KK) {
		// TODO Auto-generated method stub
		return KKRepository.updateKK(Id, KK);
	}

	@Override
	public tb_kartuKeluarga deleteKK(int Id) {
		// TODO Auto-generated method stub
		return KKRepository.deleteKK(Id);
	}

	@Override
	public tb_kartuKeluarga getIdKK(int Id) {
		// TODO Auto-generated method stub
		return KKRepository.getIdKK(Id);
	}

	@Override
	public List<tb_kartuKeluarga> getAllKK() {
		// TODO Auto-generated method stub
		return KKRepository.getAllKK();
	}

}
