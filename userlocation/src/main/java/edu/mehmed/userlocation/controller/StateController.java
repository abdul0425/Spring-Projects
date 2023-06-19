package edu.mehmed.userlocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mehmed.userlocation.constant.AppConstant;
import edu.mehmed.userlocation.dto.StateDto;
import edu.mehmed.userlocation.service.StateService;

@Controller
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class StateController {

	@Autowired
	private StateService stateService;
	
	StateController()
	{
		System.out.println("State Controller Object created !");
	}
	
	
	@RequestMapping(value=AppConstant.SAVE_STATE_DETAILS)
	public ModelAndView saveStateDetails(StateDto stateDto)
	{
		System.out.println(stateDto);
		stateService.setStateDetails(stateDto);
		return new ModelAndView("displayState.jsp");
	}
}
