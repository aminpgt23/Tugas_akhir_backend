package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_kartu_keluarga")
public class tb_kartuKeluarga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String alamat;
	private String desa_kelurahan;
	private String kabupaten_kota;
	private String kecamatan;
	private int kode_post;
	
	@Column(unique = true)
	private int nomer_kk;
	private String provinsi;
	private int rt;
	private int rw;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getDesa_kelurahan() {
		return desa_kelurahan;
	}
	public void setDesa_kelurahan(String desa_kelurahan) {
		this.desa_kelurahan = desa_kelurahan;
	}
	public String getKabupaten_kota() {
		return kabupaten_kota;
	}
	public void setKabupaten_kota(String kabupaten_kota) {
		this.kabupaten_kota = kabupaten_kota;
	}
	public String getKecamatan() {
		return kecamatan;
	}
	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}
	public int getKode_post() {
		return kode_post;
	}
	public void setKode_post(int kode_post) {
		this.kode_post = kode_post;
	}
	public int getNomer_kk() {
		return nomer_kk;
	}
	public void setNomer_kk(int nomer_kk) {
		this.nomer_kk = nomer_kk;
	}
	public String getProvinsi() {
		return provinsi;
	}
	public void setProvinsi(String provinsi) {
		this.provinsi = provinsi;
	}
	public int getRt() {
		return rt;
	}
	public void setRt(int rt) {
		this.rt = rt;
	}
	public int getRw() {
		return rw;
	}
	public void setRw(int rw) {
		this.rw = rw;
	}
	
	
	
	
}
