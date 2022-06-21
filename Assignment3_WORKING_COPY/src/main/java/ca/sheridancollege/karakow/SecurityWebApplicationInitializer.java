package ca.sheridancollege.karakow;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import ca.sheridancollege.karakow.security.SecurityConfig;

public class SecurityWebApplicationInitializer 
	extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() { 
		
		super(SecurityConfig.class);
	}
	
}
