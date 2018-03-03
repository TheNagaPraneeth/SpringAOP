package com.dunnala.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)

public class MyApiAnalyticsAspect {
	
	
	@Before("com.dunnala.aopdemo.aspect.MyPointcutExpressions.forExcludingSettersAndGetters()")
	public void myApiAnalytics() {
		System.out.println("\n====>>> Executing Api Analytics Aspect/Functionality at:" +System.currentTimeMillis());
	}

}
