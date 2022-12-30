package com.cjc.OTFS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.OTFS.model.Ebook;

public interface BookRepo extends JpaRepository<Ebook, Integer>{

}
