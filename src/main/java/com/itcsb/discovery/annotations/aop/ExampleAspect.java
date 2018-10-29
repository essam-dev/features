package com.itcsb.discovery.annotations.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExampleAspect {

	@Around("@annotation(com.itcsb.discovery.annotations.annotates.BusinessLog)")
	public Object LogExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(joinPoint.getSignature() + " is being under the watch of " + ExampleAspect.class.getName());
		return joinPoint.proceed();
	}

}
