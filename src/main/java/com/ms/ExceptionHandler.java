package com.ms;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class ExceptionHandler extends SimpleMappingExceptionResolver {

    @Override
    protected ModelAndView doResolveException(HttpServletRequest arg0,
	    HttpServletResponse arg1, Object arg2, Exception arg3) {

	return super.doResolveException(arg0, arg1, arg2, arg3);
    }

}
