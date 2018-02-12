//package com.sereg.movie.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//@EnableWebMvc
//@EnableGlobalMethodSecurity(securedEnabled = true)
//public class SerurityConfig extends WebMvcConfigurerAdapter {
//
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/api/**")
//		.allowedOrigins("*")
//        .allowedHeaders("*")
//        .allowedMethods("*")
//        .allowCredentials(true);
//	}
//
//	@Autowired
//	public void configAuth(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//				.withUser("admin")
//				.password("password")
//				.roles("ADMIN")
//			.and()
//				.withUser("user")
//				.password("pass")
//				.roles("USER");
//	}
//	
//	//@Bean
//    //public CorsFilter corsFilter() {
//        //UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        //CorsConfiguration config = new CorsConfiguration();
//        //config.setAllowCredentials(true);
//        //config.addAllowedOrigin("*");
//        //config.addAllowedHeader("*");
//        //config.addAllowedMethod("OPTIONS");
//        //config.addAllowedMethod("GET");
//        //config.addAllowedMethod("POST");
//        //config.addAllowedMethod("PUT");
//        //config.addAllowedMethod("DELETE");
//        //source.registerCorsConfiguration("/**", config);
//        //return new CorsFilter(source);
//    //}
//	
//
//	
//	//public void configure(HttpSecurity httpSec) throws Exception {
//	//	httpSec
//	//		.csrf().disable().cors();
//	//	httpSec
//			//.authorizeRequests()
//			//	.antMatchers(HttpMethod.GET, "/")
//			//	.permitAll()
//			//.and()
//	//		.formLogin()
//	//				.permitAll()
//	//		.and()
//	//			.logout()
//	//				.logoutSuccessUrl("/login?logout")
//	//				.permitAll();
//	//}
//	
//	
//}
