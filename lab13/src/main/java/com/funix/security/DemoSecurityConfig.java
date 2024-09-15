package com.funix.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users = User.withDefaultPasswordEncoder();

		auth.inMemoryAuthentication()
		    .withUser(users.username("john").password("test123").roles("EMPLOYEE"))
		    .withUser(users.username("mary").password("test123").roles("MANAGER","EMPLOYEE"))
		    .withUser(users.username("susan").password("test123").roles("ADMIN", "EMPLOYEE"));

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/leader/**").hasRole("MANAGER")
			.antMatchers("/system/**").hasRole("ADMIN")
			.antMatchers("/").hasRole("EMPLOYEE")
		.and()
		.formLogin()
			.loginPage("/login-page")
			.loginProcessingUrl("/login")
			.defaultSuccessUrl("/", true)
			.permitAll()
		.and()
			.logout()
			.permitAll()
		.and()
			.exceptionHandling()
			.accessDeniedPage("/access-denied");
	}
	
	

}
