package com.example.Models;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper =  true)
@Data

public class Student extends Person{
    private int studentNumber;
    private int avgMark;


    public boolean isEligibleToEnroll(){
        return false;
    }
    
}
