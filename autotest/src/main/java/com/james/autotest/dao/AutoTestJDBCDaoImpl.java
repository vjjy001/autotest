package com.james.autotest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.james.autotest.beans.Student;



@Repository("autoTestJDBCDao")
public class AutoTestJDBCDaoImpl implements AutoTestJDBCDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*@SuppressWarnings("unchecked")
	public List<Student> getAllStudents(){
		String sql ="select * from students";
		 List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		 return list;
		
	}
	*/
	
}
