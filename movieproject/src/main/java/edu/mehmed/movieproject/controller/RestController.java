package edu.mehmed.movieproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mehmed.movieproject.constant.AppConstant;
import edu.mehmed.movieproject.entity.TheatreInfo;
import edu.mehmed.movieproject.service.Service;

@Controller
@ResponseBody
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class RestController {

	@Autowired
	private Service service;
	
	@GetMapping(value=AppConstant.FIND_ALL_THEATRE_INFO)
	public @ResponseBody List<TheatreInfo> findAllTheatreInfo()
	{
		return service.findAllTheatreInfo();
	}
	
	@PostMapping(value=AppConstant.SET_THEATRE_INFO)
	public void setTheatreInfo(@RequestBody TheatreInfo info)
	{
		service.setTheatreInfo(info);
	}
}
