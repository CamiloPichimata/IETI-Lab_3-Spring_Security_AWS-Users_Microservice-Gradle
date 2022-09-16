package com.escuelaing.ieti.springboot.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@EnableGlobalMethodSecurity( securedEnabled = true, jsr250Enabled = true, prePostEnabled = true )
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure( HttpSecurity http ) throws Exception {

        http.cors().and().csrf().disable()
                .authorizeRequests()
                .antMatchers( HttpMethod.POST, "/api/v2/auth").permitAll()
                .antMatchers( HttpMethod.GET, "/api/v2/users").permitAll()
                .antMatchers( HttpMethod.POST, "/api/v2/users").permitAll()
                .anyRequest().authenticated()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS );
    }
}