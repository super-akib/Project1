package bank.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bank.config.AppConfig;

public class BankUser
{
    
	public static void main(String[] args) {
		
		//activate IOC container
	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	  
	      
	}
}
