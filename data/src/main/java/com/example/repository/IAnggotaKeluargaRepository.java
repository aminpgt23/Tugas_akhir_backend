package com.example.repository;

import java.util.List;

import com.example.model.tb_anggotaKeluarga;



public interface IAnggotaKeluargaRepository {
	public tb_anggotaKeluarga insertKK(tb_anggotaKeluarga anggotakeluarga);
	public tb_anggotaKeluarga updateKK(int Id,tb_anggotaKeluarga anggotakeluarga);
	public tb_anggotaKeluarga deleteKK(int Id);
	public tb_anggotaKeluarga getIdKK(int Id);
	public List<tb_anggotaKeluarga> getAllKK();
	public List<tb_anggotaKeluarga> getIdKK(String id_kk);
	public List<tb_anggotaKeluarga> deleteIdKK(String id_kk);
}
