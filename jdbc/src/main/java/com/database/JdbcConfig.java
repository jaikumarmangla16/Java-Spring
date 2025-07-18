package com.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.database.dao.StudentDao;
import com.database.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.database.dao"} )
public class JdbcConfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
			jdbcTemplate.setDataSource(getDataSource());
			return jdbcTemplate; 
	}
//	@Bean("Studentdao")
//	public StudentDao getStudentDao() {
//		StudentDaoImpl Studentdao= new StudentDaoImpl();
//		Studentdao.setJdbcTemplate(getTemplate());
//		return Studentdao;
//		
//	}
}
