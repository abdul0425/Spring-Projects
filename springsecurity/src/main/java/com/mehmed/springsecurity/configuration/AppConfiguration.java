package com.mehmed.springsecurity.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.mehmed.springsecurity")
@EnableWebMvc
public class AppConfiguration {

	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/");
		view.setSuffix(".jsp");
		return view;
	}
}
