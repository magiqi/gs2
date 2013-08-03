package com.ms.common.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.ServletContextRequestLoggingFilter;

public class Testfilter extends ServletContextRequestLoggingFilter {

	@Override
	protected void afterRequest(HttpServletRequest request, String message) {
		System.out.println("我已经走完了action,可以开启事务");
		super.afterRequest(request, message);
	}

	@Override
	protected void beforeRequest(HttpServletRequest request, String message) {
		System.out.println("我已经走完了action,这里可以加session提交");
		super.beforeRequest(request, message);
	}

}
