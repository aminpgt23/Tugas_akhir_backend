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

import com.example.model.tb_kartuKeluarga;
import com.example.service.IKartuKeluargaService;


@RestController
@CrossOrigin(origins ="http://localhost:8080")
@RequestMapping("/api/kk")
public class kkController {
		
	 @Autowired
	  IKartuKeluargaService kkService;
	 
	  @PostMapping("/insert")
	  public tb_kartuKeluarga insertKK(@RequestBody tb_kartuKeluarga KK) {
		return kkService.insertKK(KK);
		  
	  }
	  @PutMapping("/update/{Id}")
	  public tb_kartuKeluarga updateKK( @PathVariable int Id, @RequestBody tb_kartuKeluarga KK) {
		return kkService.updateKK(Id, KK);
		  
	  }
	  @DeleteMapping("/delete/{Id}")
	  public tb_kartuKeluarga deleteKK(@PathVariable int Id) {
		  return kkService.deleteKK(Id);
	  }
	  @GetMapping("/getById/{Id}")
	  public tb_kartuKeluarga getIdKK(@PathVariable int Id) {
		  return kkService.getIdKK(Id);
	  }
	  @GetMapping("/getAll")
		public List<tb_kartuKeluarga> getAllKK(){
			return kkService.getAllKK();
		}
}
