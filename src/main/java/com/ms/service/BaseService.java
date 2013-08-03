package com.ms.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
    
    @Autowired
    private SessionFactory sessionFacotry;

    public SessionFactory getSessionFacotry() {
	return sessionFacotry;
    }

    public void setSessionFacotry(SessionFactory sessionFacotry) {
	System.out.println("-------");
	this.sessionFacotry = sessionFacotry;
    }

    public void save(Object o) {
	sessionFacotry.getCurrentSession().saveOrUpdate(o);
    }

}
