package com.dunnala.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
    
		
	
	@Before("com.dunnala.aopdemo.aspect.MyPointcutExpressions.forExcludingSettersAndGetters()")
	public void praneethLoggingMethod() {
		System.out.println("\n====>>> Executing Logging Aspect/Functionality at:" +System.currentTimeMillis());
	}
	
	
	
	
	

	
	
	
	
	
	
	
}
