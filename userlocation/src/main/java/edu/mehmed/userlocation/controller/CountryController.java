package edu.mehmed.userlocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.mehmed.userlocation.dto.CountryDto;
import edu.mehmed.userlocation.service.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	CountryController()
	{
		System.out.println("Country Controller Object created !");
	}
	
	public void saveCountryDetails(CountryDto dto)
	{
		System.out.println(dto);
	}
}
