package com.dunnala.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {
	

	@Before("com.dunnala.aopdemo.aspect.MyPointcutExpressions.forExcludingSettersAndGetters()")
	public void LogToCloudAysnc() {
		System.out.println(" \\n====>>> Executing Cloud Async at:" +System.currentTimeMillis());
	}
}
