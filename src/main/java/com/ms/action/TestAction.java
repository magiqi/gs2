package com.ms.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.ms.model.TestBean;
import com.ms.service.BaseService;

/**
 * 
 * @author magi.qi
 * 
 */
public class TestAction extends MultiActionController {

	public ModelAndView test(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		TestBean testBean = new TestBean();
		testBean.setName("hh²»°¡");
		try {

			this.baseService.save(testBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.getWriter().write("haha");
		return null;
	}

	/**
	 * »ù´¡bean
	 */
	private BaseService baseService;

	public BaseService getBaseService() {
		return baseService;
	}

	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
}
