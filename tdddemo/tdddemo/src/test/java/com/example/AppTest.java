package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Models.Address;
import com.example.Models.Person;
//import com.example.Services.Services;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void isAddressSetTest()
    {
        Address addr1 = new Address();
        addr1.setCity("Dehradun");
        addr1.setState("UK");

        Address addr2 = new Address();
        addr2.setCity("Delhi");
        addr2.setState("Delhi");


        Person p = new Person();
        p.setAddr(addr1);

        boolean result = new services().isAddressSet(p, addr1);

        // if the value is true --> pass ? fail
        assertTrue("Address is correct and set successfully", result);
    }
}
