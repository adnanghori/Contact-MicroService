package com.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
	
		@GetMapping("/user-service-fallback")
		public String userServiceFallBack() {
			return "User Service is down";
		}
		@GetMapping("/contact-service-fallback")
		public String contactServiceFallBack() {
			return "Contact Service is down";
		}
}
