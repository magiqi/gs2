package com.ms.service;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    private SessionFactory sessionFacotry;

    public SessionFactory getSessionFacotry() {
	return sessionFacotry;
    }

    public void setSessionFacotry(SessionFactory sessionFacotry) {
	this.sessionFacotry = sessionFacotry;
    }

    public void save(Object o) {
    	sessionFacotry.getCurrentSession().saveOrUpdate(o);
    }

}
