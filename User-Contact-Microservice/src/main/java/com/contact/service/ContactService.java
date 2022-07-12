package com.contact.service;
import java.util.List;
import com.contact.model.*;


public interface ContactService {
	
		public List<Contact> getContacts(Long userId);
}
