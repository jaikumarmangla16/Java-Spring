package com.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

import com.database.dao.StudentDao;
import com.database.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	Scanner sc=new Scanner(System.in);
//    	int id=sc.nextInt();
//        ApplicationContext context =new ClassPathXmlApplicationContext("com/database/config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        JdbcTemplate template =context.getBean("jdbcTemplate",JdbcTemplate.class);
//        //insert
//        
//        String query="insert into student(id,name,city) values(?,?,?)";
//////        
//        //fire the quewry
//        int result = template.update(query,333,"okaysji","Faridabad");
//        
//        System.out.println("number record..."+result);
////
        
        StudentDao dao = context.getBean("Studentdao",StudentDao.class);
        Student s=new Student();
//        s.setId(12345);
//        s.setCity("delhii");
//        s.setName("avishi");
//        
//        	int result=dao.insert(s);
//        System.out.println("added"+result); 
        
        
        //update
//        s.setId(12345);
//        s.setName("avishi");
//        s.setCity("nepddali");
//        int result=dao.change(s);
//        System.out.println("updated"+result) ;
        
        
        //delete
//        int result=dao.delete();
//        System.out.println("deleted"+ result);
//        Student student = dao.getStudent(111);
//        System.out.println(student);
        Student student = dao.getStudent(111);
        System.out.println("Fetched: " + student);
        
        System.out.println("----------------------------------------------");

        List<Student> student1 = dao.getAllStudents();
        for(Student s1:student1) {
        	
        	System.out.println("Fetched: " + s1);
        }
    }
}
