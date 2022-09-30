package com.spring.spring.services;

import java.util.List;

import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.spring.spring.entities.Suburb;
import com.spring.spring.dao.SuburbRepo;;

@Service
@Transactional
public class SuburbServiceImpl implements SuburbService {
	
	@Autowired
	private SuburbRepo suburbRepo;
		
	List<Suburb> list;
		
	@Override
	public List<Suburb> getAll() {
		
		//For oracle
		//return suburbRepo.findAll();
		
		return suburbRepo.findAll(Sort.by(Sort.Direction.ASC,"id"));
	}
	
	@Override
	public List<Suburb> createSuburbData(List<Suburb> suburbs) {
		
		return suburbRepo.saveAll(suburbs);
		//list = suburbRepo.saveAll(suburbs);
		
		//return list;
	}

	@Override
	public Suburb saveCourse(Suburb suburb) {
		
		return suburbRepo.save(suburb);
	}
	
//	@Override
//	public String getSubName(List<Suburb> postcode) {
//		
//		//Java stream usage
//		List<Long> postCode = postcode.stream().map(list -> list.getPostcode()).collect(Collectors.toList());
//		
//		List<Suburb> semifinal = list.stream().filter(e -> postCode.contains(e.getPostcode())).collect(Collectors.toList());
//		
//		List<String> flist = semifinal.stream().map(e-> e.getSuburb()).sorted().collect(Collectors.toList());
//		
//		int total = flist.stream().mapToInt(String::length).sum();
//		
//		return flist + "\n\n" + "Total Character Count is: "+ total;
//	}

}