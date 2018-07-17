package com.neosoft.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { DaoConfig.class,Serviceconfig.class,transactionconfig.class })
public class RootConfig {

	
	
}
