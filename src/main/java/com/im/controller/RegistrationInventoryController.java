package com.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.entity.Register;
import com.im.service.RegistrationInventoryService;

@RestController
@RequestMapping("/Inventory")
public class RegistrationInventoryController {
	
	@Autowired
	private
	RegistrationInventoryService registrationInventoryService;
	
//	@GetMapping("/test")
//	public String Test() {
//		return "hello";
//	}
		
	//first commit
	@PostMapping("/addInventory")
	    public  void register(@RequestBody Register register) {
	        
		registrationInventoryService.saveRegistration(register);
	       
	    }
	@PostMapping("/updateInventory")
    public  void updateItem(@RequestBody Register register) {
        
	registrationInventoryService.updateItem(register);
       
    }

}
