	package com.database.dao;
	
	import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.database.entities.Student;
	@Component("Studentdao")
	public class StudentDaoImpl implements StudentDao {
	
		
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		
		public JdbcTemplate getJdbcTemplate() {
			return jdbcTemplate;
		}
	
		@Autowired
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}
	
	
		@Override
		public int insert(Student student) {
			// TODO Auto-generated method stub
			String query="insert into student(id,name,city) values(?,?,?)";
	        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
			return r;
		}


		@Override
		public int change(Student student) {
			// TODO Auto-generated method stub
			//update
			String query="update student set name=?, city=? where id=?";
			int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
			
			
			return update;
		}


		@Override
		public int delete(int studentId) {
			// TODO Auto-generated method stub
			String query="delete from student where id=?";
			int del = this.jdbcTemplate.update(query,studentId);
			return del;
		}

// single student
		@Override
		public Student getStudent(int studentId) {
			// TODO Auto-generated method stub
			String query="select * from student where id=?";
//			RowMapper<Student> rowMapper=new RowMapperImpl();
 			Student student=this.jdbcTemplate.queryForObject(query,new RowMapper<Student>(){

				@Override
				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student student = new Student();
					student.setId(rs.getInt(1));
					student.setName(rs.getString(2));
					student.setCity(rs.getString(3));
					
					return student;
				}
 				
 			},studentId);
			return student;
		}

// multiple student
		@Override
		public List<Student> getAllStudents() {
			// TODO Auto-generated method stub
			String query="select * from student";
			List<Student> query2 = this.jdbcTemplate.query(query,new RowMapperImpl());
			
			return query2;
		}
	
		
	
	}
