package com.example;

import com.example.Models.Address;
import com.example.Models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Address studentAddr = new Address();
        studentAddr.setCity("Hyderabad");
        studentAddr.setCountry("India");
        studentAddr.setPostalCode(248112);
        studentAddr.setState("UK");

        Student s = new Student();
        s.setAddr(studentAddr);

        System.out.println( s.getAddr() );
    }
}
