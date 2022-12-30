package com.cjc.OTFS.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.OTFS.model.Ebook;
import com.cjc.OTFS.model.Tutor;
import com.cjc.OTFS.model.Parent;
import com.cjc.OTFS.service.AdminService;

@RestController
@RequestMapping ("/Admin")
public class AdminController {

	@Autowired
	private AdminService service;

	@Autowired
	private JavaMailSender sender;
	
	@PostMapping ("/saveTutor")
	public String saveTutor (@RequestBody Tutor tutor) {
		
		service.saveTutor (tutor);
		return "Tutor details saved";
	}

	@GetMapping ("/getTutor")
	public List <Tutor> getTutor (){
		List <Tutor> list = service.getTutor ();
		return list;
	}
	
	@PostMapping ("/saveEbook")
	public String saveEbook (@RequestBody Ebook ebook) {
		service.saveEbook (ebook);
		return "Ebook saved";
	}
	
	@GetMapping ("/getEbook")
	public List <Ebook> getEbook (){
		List <Ebook> list =service.getEbook();
		return list ;
		
	}
	
	@GetMapping ("/getParent")
	public List <Parent> getParent () {
		List<Parent> list =service.getParent();
		return list;
	}
	
	@GetMapping ("/bookTutor/{tutorId}")
	public String bookTutor (@PathVariable int tutorId, String from ) {
		 Tutor tutor = service.bookTutor (tutorId);
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setFrom(from);
		mail.setTo(tutor.getEmail());
		mail.setSubject("Demo booking");
		mail.setText("Request for demo lecture :" + " " + tutor.getSubject());
	
		sender.send(mail);
		
		return "Demo lecturing booking request email sent to :" +tutor.getName();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
