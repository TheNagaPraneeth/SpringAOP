package com.dunnala.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dunnala.aopdemo.dao.AccountDAO;
import com.dunnala.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read spring config java class
		AnnotationConfigApplicationContext context
		= new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//get the membership DAO
		AnnotationConfigApplicationContext context1
		= new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		//get the bean from spring
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		//call the account dao getters/setters
		theAccountDAO.setName("praneeth");
		theAccountDAO.getName();

		theAccountDAO.setServiceCode("ABC");
		theAccountDAO.getServiceCode();

		
		//call the business method
		theAccountDAO.addAccount();
		
		theMembershipDAO.addAccount();
		
		
		
		
		
		
		
		//close the context
		context.close();
		
		

	}

}
