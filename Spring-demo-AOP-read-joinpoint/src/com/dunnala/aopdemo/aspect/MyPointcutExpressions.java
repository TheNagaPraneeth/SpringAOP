package com.dunnala.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 

public class MyPointcutExpressions {

	
	 //----------------------------
	  /*pointcut expressions*/
	//-----------------------------

	@Pointcut("execution(* com.dunnala.aopdemo.dao.*.*(..))")	
	public void forDaoPackage() {}
	//Pointcutexpressions
	//create pointcut for getter methods
	@Pointcut("execution(* com.dunnala.aopdemo.dao.*.set*(..))")	
	public void forSetterPackage() {}
	
	//create pointcut for setter methods
	@Pointcut("execution(* com.dunnala.aopdemo.dao.*.get*(..))")	
	public void forGetterPackage() {}	
	
	
	//create point include package.. exclude getter/setter
	@Pointcut("forDaoPackage() && !(forSetterPackage() || forGetterPackage() )")
	public  void forExcludingSettersAndGetters() {}	
}
