package edu.mehmed.userlocation.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import edu.mehmed.userlocation.dto.CountryDto;
import edu.mehmed.userlocation.entity.CountryEntity;
import edu.mehmed.userlocation.repository.Repository;

public class CountryService {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private Repository repository;
	
	public void setCountryDetails(CountryDto dto)
	{
		CountryEntity countryEntity = modelMapper.map(dto, CountryEntity.class);
		repository.saveCountryDetails(countryEntity);
		
		
	}
}
