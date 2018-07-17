package com.neosoft.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.neosoft.authenticate.EmployeeRegistrationHLO;
import com.neosoft.authenticate.EmployeeRegistrationdto;
import com.neosoft.repository.EmployeeDaoimpl;


@Service
public class EmployeeServiceImpl {
	
	@Autowired
	private EmployeeDaoimpl dao;
	
	//saving authenticate details\
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false,transactionManager="hbtxmg")
	public String authenticateDetails(EmployeeRegistrationdto dto){
		EmployeeRegistrationHLO hlo=new EmployeeRegistrationHLO();
		BeanUtils.copyProperties(dto, hlo);
		
		int i=dao.insertAuthenticateDetails(hlo);
		System.out.println(i);
		if(i==1)
			return "authenticarte details inserted successfully";
		else
			return "authenticate details not inserted";
		
		
	}
	

}
