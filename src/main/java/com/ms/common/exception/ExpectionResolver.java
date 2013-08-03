package com.ms.common.exception;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ExpectionResolver implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target,
			RuntimeException throwable) {
		 
	}

	public void afterThrowing(RuntimeException throwable) {
		
	}
}
