package com.tugcankoparan.customer.services;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class CustomerService implements MessageSourceAware
{
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void printMessage(){
		String name = messageSource.getMessage("customer.name", new Object[] { 24, "Firat University" }, Locale.US);
    	System.out.println(name);
    	
	}
	
}
