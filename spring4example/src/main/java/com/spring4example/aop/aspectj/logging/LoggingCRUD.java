package com.spring4example.aop.aspectj.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring4example.sample.service.SampleService;

@Aspect
public class LoggingCRUD {
	
	@Autowired
    public SampleService sampleService;

	@Before("execution(* com.daelim.wcrm.*.controller.*Controller.list(..)) && args(name)")
	public void logBeforeList(JoinPoint joinPoint, String name) {
		System.out.println("execute method name : " + joinPoint.getSignature().getName());
		System.out.println("execute method parameter map : " + name);
	}
}
