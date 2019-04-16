package com.thisaru.demo.repository;

import com.thisaru.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Document, Integer>{
}
