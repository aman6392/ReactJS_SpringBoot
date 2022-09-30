package com.spring.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.entities.Suburb;
import com.spring.spring.services.SuburbService;

@RestController
@RequestMapping("/api")
public class MyController {

	@Autowired
	private SuburbService suburbService;
	
	/*This will show the description of the API*/
	@GetMapping("/home")
	public String home() {
		
		return "This API will display Western Australia suburb names, their associated postcodes, and resultant total character count";
	}
	
	/*Return all saved id, suburb name and post codes*/
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping("/getAll") 
	public List<Suburb> getAll(){
		
		try {
			return this.suburbService.getAll();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	/*This will save the entire suburb data into H2 database and display the saved data to the user*/
	@PostMapping(path="/saveAll", consumes = "application/json")
	public List<Suburb> createSuburbData(@RequestBody List<Suburb> suburbs) {
		
		try {
			return this.suburbService.createSuburbData(suburbs);
		}
		catch(Exception e) {
			return null;
		}
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping(path="/saveACourse")
	public Suburb saveCourse(@RequestBody Suburb suburb) {
		
		try {
			return this.suburbService.saveCourse(suburb);
		}
		catch(Exception e) {
			return null;
		}
	}
	
	/*This will display the suburb name as per the given post codes range in the request body in JSON format
	 * Java Stream usage can be found in the below method*/
//	@PostMapping(path="/getSubName", consumes = "application/json")
//	public String getSubName(@RequestBody List<Suburb> postcode) {
//		
//		try {
//			return this.suburbService.getSubName(postcode);
//		}
//		catch(Exception e) {
//			return "" + e.getMessage();
//		}
//		
//	}
	
}
