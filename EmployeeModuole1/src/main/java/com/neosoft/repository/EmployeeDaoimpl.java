package com.neosoft.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.neosoft.authenticate.EmployeeRegistrationdto;
import com.neosoft.authenticate.EmployeeRegistrationHLO;

@Repository
public class EmployeeDaoimpl {

	@Autowired
	private HibernateTemplate ht;
	
	
	public List<String> getCountries(){
		
		
		return null;
		
		
	}
	
	
//	public void getEmployeeauthentication_details(@ModelAttribute("authenticatedetails")
//	                                                 EmployeeRegistrationdto authenticatedetails){
//		
//		
//		
//	}
	
	public int insertAuthenticateDetails(EmployeeRegistrationHLO hlo){
		int i=0;
		try{
			
		
		
		System.out.println(hlo.getSno()+"...."+hlo.getEmail()+"----"+hlo.getPassword()+"---"+hlo.getUsername());
		
		 i=(Integer) ht.save(hlo);
		return i;
		}catch(Exception e){
			e.printStackTrace();
			return i;
		}
		
	}
	
}
