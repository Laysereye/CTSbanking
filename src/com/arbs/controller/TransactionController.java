package com.arbs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arbs.bo.CustomerBO;
import com.arbs.model.Account;
import com.arbs.model.Customer;

public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String buttonDeposit=request.getParameter("transaction");
		if("Deposit".equals(buttonDeposit))
		{
			String account_no=request.getParameter("account_no");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			String amount=request.getParameter("amount");
			Customer customer=new Customer();
			customer.setUsername(username);
			customer.setPassword(password);
			Account account=new Account();
			account.setAccount_id(account_no);
			account.setBalance(Double.parseDouble(amount));
			account.setCustomer(customer);
			CustomerBO.depositAmount(customer,account);
			
		}
	}

}
