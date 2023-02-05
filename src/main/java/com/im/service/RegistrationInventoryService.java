package com.im.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.im.entity.Register;
import com.im.repo.RegistrationInventoryRepo;

@Service
public class RegistrationInventoryService {
	
	@Autowired
	RegistrationInventoryRepo registrationInventoryRepo;

	public void saveRegistration(Register register) {
		
		registrationInventoryRepo.save(register);
	}
	
	public void updateItem(Register register) {
		
	Optional<Register> op	=registrationInventoryRepo.findById(register.getId());
	Register item=op.get();
	System.out.println(item.getName());
	item.setName(register.getName());
	item.setcName(register.getcName());
	item.setRegistrationId(register.getRegistrationId());
	item.setProductCategory(register.getProductCategory());
	item.setDateOfEntry(register.getDateOfEntry());
	registrationInventoryRepo.save(item);
	}
	

}
