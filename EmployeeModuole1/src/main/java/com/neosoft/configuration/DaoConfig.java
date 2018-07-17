package com.neosoft.configuration;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.neosoft.authenticate.EmployeeRegistrationHLO;

@Configuration
@ComponentScan(value="com.neosoft.repository")
public class DaoConfig {
	

	@Bean
public BasicDataSource getDataSource(){	
	
	BasicDataSource ds=new BasicDataSource();
    ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	ds.setUsername("USERNAME");
	ds.setPassword("PASSWORD");
	return ds;
	
}
	
	@Bean
	public LocalSessionFactoryBean getsessionfactory(){
		
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setAnnotatedClasses(new Class[]{EmployeeRegistrationHLO.class});
		Properties p=new Properties();
		p.put("hibernate_show", true);
		p.put("hibernate.format_sql", true);
		p.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		factory.setHibernateProperties(p);
		return factory;
		
		
		
	}
	@Bean(name="sessfactory")
	public SessionFactory getFactory(){
		return getsessionfactory().getObject();
	}
	
	@Bean
	public HibernateTemplate getTemplate(){
		return new HibernateTemplate(getFactory());
		
	}

}
