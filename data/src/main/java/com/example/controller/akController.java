package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.tb_anggotaKeluarga;
import com.example.service.IAnggotaKeluargaService;

@RestController
@CrossOrigin(origins ="http://localhost:8080")
@RequestMapping("/api/ak")
public class akController {
	 @Autowired
	  IAnggotaKeluargaService akService;

	 @PostMapping("/insert")
	  public tb_anggotaKeluarga insertKK(@RequestBody tb_anggotaKeluarga anggotakeluarga) {
		return akService.insertKK(anggotakeluarga);
		  
	  }
	 @PutMapping("/update/{Id}")
	  public tb_anggotaKeluarga updateKK( @PathVariable int Id, @RequestBody tb_anggotaKeluarga anggotakeluarga) {
		return akService.updateKK(Id, anggotakeluarga);
		  
	  }
	 @DeleteMapping("/delete/{Id}")
	  public tb_anggotaKeluarga deleteKK(@PathVariable int Id) {
		  return akService.deleteKK(Id);
	  }
	 @GetMapping("/getById/{Id}")
	  public tb_anggotaKeluarga getIdKK(@PathVariable int Id) {
		  return akService.getIdKK(Id);
	  }
	 @GetMapping("/getAll")
		public List<tb_anggotaKeluarga> getAllKK(){
			return akService.getAllKK();
		}
		@GetMapping("/getIdKK/{id_kk}")
		public List<tb_anggotaKeluarga> getIdKK(@PathVariable String id_kk ){
			return akService.getIdKK(id_kk);
		}
		@DeleteMapping("/deleteIdKK/{id_kk}")
		public List<tb_anggotaKeluarga> deleteIdKK(@PathVariable String id_kk) {
			return akService.deleteIdKK(id_kk);
		}
}
