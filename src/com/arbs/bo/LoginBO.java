package com.arbs.bo;

import com.arbs.dao.LoginDAO;
import com.arbs.model.Customer;

public class LoginBO {

	public static Customer validatedeatils(String userName) throws Exception {
		Customer customer=LoginDAO.validatedetails(userName);
		return customer;
		
	}

}
