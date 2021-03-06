package com.arbs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arbs.model.Account;
import com.arbs.model.Customer;
import com.arbs.util.HibernateUtil;

public class CustomerDAO {

	public static boolean createCustomer(Customer customer) {
		//Configuration configuration=new Configuration().configure();
		//SessionFactory sessionFactory=configuration.buildSessionFactory();
		boolean b=false;
		Session session=null;
		Transaction tr=null;
		try
		{
		session=HibernateUtil.getSessionFactory().openSession();
		tr=session.beginTransaction();
		
		session.persist(customer);
		tr.commit();
		System.out.println("Sucessfully");
		b=true;
		}
		catch(Exception e)
		{
			b=false;
			tr.rollback();
			
		}
		finally
		{
			session.close();
		}
		return b;
		
	}
	public static String Lastid()
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		String hql="Select max(id) from Customer";
		Query q=session.createQuery(hql);
		List<String> l=q.list();
		System.out.println("list 1st id:"+l.get(0));
		return l.get(0);
		
	}
	public static List<Customer> searchIdbyName(String name) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		String hql="from Customer C where C.firstname=:fnm";
		Query q=session.createQuery(hql);
		q.setParameter("fnm", name);
		List<Customer> customerlist=q.list();
		System.out.println("Customer Name by Id:"+customerlist.get(0));
		return customerlist;
		
	}
	public static void depositAmount(Customer customer, Account account) {
		System.out.println("Dao te username:"+customer.getUsername());
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer customerfromDB=(Customer)session.get(Customer.class, customer.getUsername());// checking where username valid or not
		if(customerfromDB!=null)
		{
			System.out.println("account id:"+account.getAccount_id());
			Account accountfronDB=(Account)session.get(Account.class,account.getAccount_id());//checking where account is linked or not
		}
		
	}
	

}
