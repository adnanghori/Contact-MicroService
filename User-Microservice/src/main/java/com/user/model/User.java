package com.user.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
		private Long userId;
		private String userName;
		private String userContact;
		
		
		private List<Contact> userContacts = new ArrayList<>();
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(Long userId, String userName, String userContact, List<Contact> userContacts) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userContact = userContact;
			this.userContacts = userContacts;
		}
		public User(Long userId, String userName, String userContact) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.userContact = userContact;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserContact() {
			return userContact;
		}
		public void setUserContact(String userContact) {
			this.userContact = userContact;
		}
		public List<Contact> getUserContacts() {
			return userContacts;
		}
		public void setUserContacts(List<Contact> userContacts) {
			this.userContacts = userContacts;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + "]";
		}
		
		
 }
