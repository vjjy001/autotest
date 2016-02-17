package com.james.autotest.service;

import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.james.autotest.beans.Student;
import com.james.autotest.dao.AutoTestDao;
import com.james.autotest.dao.AutoTestDaoImpl;
import com.james.autotest.dao.AutoTestJDBCDao;
import com.james.autotest.dao.AutoTestJDBCDaoImpl;


public class TestSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-datasource-laus-jdbctemplate.xml",
				"spring-datasource-laus.xml"
				);  //spring-datasource.xml
       AutoTestJDBCDao service = context.getBean(AutoTestJDBCDaoImpl.class);
  
       	
     /* List<Student> list =  service.getAllStudents();
      ListIterator< Student> iterator = list.listIterator();
      while(iterator.hasNext()){
    	  Student student = iterator.next();
    	  System.out.println(student.getSTU_FIRST_NAME()+student.getSTU_LAST_NAME()+student.getSTU_FINANCIAL_AID_ID()+student.getSTU_ID());
      }*/
 
      AutoTestDao service2 = context.getBean(AutoTestDaoImpl.class);
      service2.getAllStates();
      
	}

}
