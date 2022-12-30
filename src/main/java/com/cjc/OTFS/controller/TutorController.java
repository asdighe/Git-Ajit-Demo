package com.cjc.OTFS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.OTFS.model.Tutor;
import com.cjc.OTFS.service.AdminService;

@RestController
@RequestMapping ("/Tutor")
public class TutorController {

	@Autowired
	private AdminService service;
	
	@PutMapping ("/updateTutor")
	public String updateTutor (@RequestBody Tutor tutor) {
	
		service.updateTutor (tutor);
		return "Tutor details updated";
	}
}
