package com.pack1;

import com.pack1.Dao.StudentDaoImpl;
import com.pack1.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student std1=new Student(666, "Louis", "Dehradun");
        Student std2=new Student(777, "Manish", "Delhi");
        
        StudentDaoImpl dao=new StudentDaoImpl();
        int rows=dao.insertIntoDb(std2);
        System.out.println(rows +" entered");
    }
}
