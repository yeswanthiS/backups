package com.example.Models;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper = true)
@Data


public class Professor extends  Person {
    private double salary;
    
}
