package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneBookController {
	
	@Autowired
	private PhoneBookService phoneBookService;
	
	@RequestMapping("/")
	public List<Contact> getAll(){
		
		return phoneBookService.getAll();
	}

}
