package edu.mehmed.userlocation.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mehmed.userlocation.dto.StateDto;
import edu.mehmed.userlocation.entity.StateEntity;
import edu.mehmed.userlocation.repository.Repository;

@Service
public class StateService {

	@Autowired
	private Repository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	public void setStateDetails(StateDto stateDto)
	{
		StateEntity stateEntity = modelMapper.map(stateDto, StateEntity.class);
		repository.saveStateDetails(stateEntity);
	}
}
