package com.cjc.OTFS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.OTFS.model.Parent;
import com.cjc.OTFS.model.Tutor;
import com.cjc.OTFS.service.AdminService;

@RestController
@RequestMapping ("/ParentProd")
public class ParentController {

	@Autowired
	private AdminService service;
	
	@PostMapping ("/saveParent")
	public String saveParent (@RequestBody Parent parent) {
		service.saveParent (parent);
		return "Parent details saved";	
	}
	
	@GetMapping ("/getParent")
	public List <Parent> getparent (){
	List <Parent> list =service.getParent ();
	return list ;
		
	}
	
	@GetMapping ("/getAllTutors")
	public List <Tutor> getAllTutors (){
		
		List <Tutor> tutor = service.getTutor();
		return tutor;
	}
	
}
