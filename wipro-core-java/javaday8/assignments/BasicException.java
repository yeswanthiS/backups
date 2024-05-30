package javaday8.assignments;

public class BasicException {
    public static void main(String args[]){
        try{
            int result =10/0;
            System.out.println("result" + result);
        } catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }
    }
    
}
