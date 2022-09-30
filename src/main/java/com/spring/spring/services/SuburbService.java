package com.spring.spring.services;

import java.util.List;

import com.spring.spring.entities.Suburb;

public interface SuburbService {

	/*We cannot define body in the interface class.
	Body is defined in the child class which is implementation class.
	We have done this loose coupling so that we just need to change the implementation class*/ 
	
	public List<Suburb>	getAll();
	
	public List<Suburb> createSuburbData(List<Suburb> suburbs);
	
//	public String getSubName(List<Suburb> postcode);
	
	public Suburb saveCourse(Suburb suburb);
}


