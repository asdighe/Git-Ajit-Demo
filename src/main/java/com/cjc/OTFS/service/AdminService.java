package com.cjc.OTFS.service;

import java.util.List;

import com.cjc.OTFS.model.Ebook;
import com.cjc.OTFS.model.Parent;
import com.cjc.OTFS.model.Tutor;

public interface AdminService {

	void saveParent(Parent parent);

	List<Parent> getParent();

	void saveTutor(Tutor tutor);

	List<Tutor> getTutor();

	void saveEbook(Ebook ebook);

	List<Ebook> getEbook();

	void updateTutor(Tutor tutor);

	Tutor bookTutor(int tutorId);

}
