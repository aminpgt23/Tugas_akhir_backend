package com.example.service;

import java.util.List;

import com.example.model.tb_kartuKeluarga;


public interface IKartuKeluargaService {
	 public tb_kartuKeluarga insertKK(tb_kartuKeluarga KK);
	 public tb_kartuKeluarga updateKK(int Id,tb_kartuKeluarga KK);
	 public tb_kartuKeluarga deleteKK(int Id);
	 public tb_kartuKeluarga getIdKK(int Id);
	 public List<tb_kartuKeluarga> getAllKK();
}
