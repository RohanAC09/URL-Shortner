package com.rohan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rohan.model.Url;

@Repository
public interface urlRepository extends JpaRepository<Url, Integer>{
	
	public Url findByShortLink(String shortLink);
	
	

}
