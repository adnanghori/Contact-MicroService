package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;
@Service
public class ContactServiceAdapter implements ContactService{

		
	private List<Contact> contacts = List.of(
				
				new Contact(1L,"a@b.com","adnan",101L),
				new Contact(2L,"v@k.com","vedant",102L),
				new Contact(3L,"e@m.com","emir",103L)
			
			);
				
		
	
	@Override
	public List<Contact> getContacts(Long userId) {
		// TODO Auto-generated method stub
		return this.contacts.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
