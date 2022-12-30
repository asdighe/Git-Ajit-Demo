package com.cjc.OTFS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.OTFS.model.Ebook;
import com.cjc.OTFS.model.Parent;
import com.cjc.OTFS.model.Tutor;
import com.cjc.OTFS.repository.BookRepo;
import com.cjc.OTFS.repository.ParentRepo;
import com.cjc.OTFS.repository.TutorRepo;

@Service
public class AdminServiceIMPL implements AdminService {

	@Autowired
	private ParentRepo prepo;

	@Autowired
	private TutorRepo trepo;

	@Autowired
	private BookRepo brepo;

	@Override
	public void saveParent(Parent parent) {

		prepo.save(parent);

	}

	@Override
	public List<Parent> getParent() {
		return prepo.findAll();
	}

	@Override
	public void saveTutor(Tutor tutor) {

		trepo.save(tutor);
	}

	@Override
	public List<Tutor> getTutor() {

		return trepo.findAll();
	}

	@Override
	public void saveEbook(Ebook ebook) {
		brepo.save(ebook);
	}

	@Override
	public List<Ebook> getEbook() {
		return brepo.findAll();
	}

	@Override
	public void updateTutor(Tutor tutor) {
		trepo.save(tutor);

	}

	@Override
	public Tutor bookTutor(int tutorId) {
		
		return trepo.findById(tutorId).get();
	}
}
