package com.asminds.spring.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.asminds.spring.dao.StudentDao;
import com.asminds.spring.model.StudentPojo;

public class StudentDaoImpl implements StudentDao{

	public Boolean save(StudentPojo sp) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(sp);
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Object Saved Successfully");
		return true;
		
	}
	

}
