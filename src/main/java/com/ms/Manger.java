package com.ms;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class Manger extends HibernateTransactionManager {

	/**
	 * 
	 */
	private static final long serialVersionUID = 428150319007733173L;

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		System.out.println("Ω¯»Î¡ÀsetSessionFactory");
		super.setSessionFactory(sessionFactory);
	}

	@Override
	protected void doRollback(DefaultTransactionStatus arg0) {
	System.out.println("doRollback");
		super.doRollback(arg0);
	}

	@Override
	protected void doCommit(DefaultTransactionStatus arg0) {
		System.out.println("doCommit");
		super.doCommit(arg0);
	}

}
