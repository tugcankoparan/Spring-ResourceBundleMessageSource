package com.tugcankoparan.common;
import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tugcankoparan.customer.services.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"locale.xml","Spring-Customer.xml"});
	
    	String name = context.getMessage("customer.name", new Object[] { 24, "Firat University" }, Locale.US);
    	System.out.println(name);
    	
    	CustomerService cust = (CustomerService) context.getBean("customerService");
    	cust.printMessage();
    }
}
