package com.contact.model;

public class Contact {

		private Long contactId;
		private String contactEmail;
		private String contactName;
		private Long userId;
		public Contact() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Contact(Long contactId, String contactEmail, String contactName, Long userId) {
			super();
			this.contactId = contactId;
			this.contactEmail = contactEmail;
			this.contactName = contactName;
			this.userId = userId;
		}
		public Long getContactId() {
			return contactId;
		}
		public void setContactId(Long contactId) {
			this.contactId = contactId;
		}
		public String getContactEmail() {
			return contactEmail;
		}
		public void setContactEmail(String contactEmail) {
			this.contactEmail = contactEmail;
		}
		public String getContactName() {
			return contactName;
		}
		public void setContactName(String contactName) {
			this.contactName = contactName;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		@Override
		public String toString() {
			return "Contact [contactId=" + contactId + ", contactEmail=" + contactEmail + ", contactName=" + contactName
					+ ", userId=" + userId + "]";
		}
		
		
}
