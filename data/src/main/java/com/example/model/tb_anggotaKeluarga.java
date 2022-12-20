package com.example.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_anggota_keluarga")
public class tb_anggotaKeluarga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String agama;
	private int id_kk;
	private String jenis_kelamin;
	private String kepala_keluarga;
	private String nama;
	@Column(unique = true)
	private int nik;
	private String pendidikan;
	private Date tanggal_lahir;
	private String tempat_lahir;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAgama() {
		return agama;
	}
	public void setAgama(String agama) {
		this.agama = agama;
	}
	public int getId_kk() {
		return id_kk;
	}
	public void setId_kk(int id_kk) {
		this.id_kk = id_kk;
	}
	public String getJenis_kelamin() {
		return jenis_kelamin;
	}
	public void setJenis_kelamin(String jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}
	public String getKepala_keluarga() {
		return kepala_keluarga;
	}
	public void setKepala_keluarga(String kepala_keluarga) {
		this.kepala_keluarga = kepala_keluarga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public String getPendidikan() {
		return pendidikan;
	}
	public void setPendidikan(String pendidikan) {
		this.pendidikan = pendidikan;
	}
	public Date getTanggal_lahir() {
		return tanggal_lahir;
	}
	public void setTanggal_lahir(Date tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}
	public String getTempat_lahir() {
		return tempat_lahir;
	}
	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}
	
	
	
}
