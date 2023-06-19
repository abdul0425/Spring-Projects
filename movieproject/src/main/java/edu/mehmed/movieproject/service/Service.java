package edu.mehmed.movieproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mehmed.movieproject.entity.TheatreInfo;
import edu.mehmed.movieproject.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

	
	@Autowired
	private Repository repository;
	
	public List<TheatreInfo> findAllTheatreInfo()
	{
		return repository.findAllTheatreInfo();
	}

	public void setTheatreInfo(TheatreInfo info) {
		repository.saveTheatreDetails(info);
	}
	
	
}
