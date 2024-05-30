package javaday8;

public class Exceptions {
    public static void main(String args[])
    {
        int result=3/0;
        String[] arr ={"a","b","c"};
        try{
            System.out.println(arr[4]);
            System.out.println(result);
        }catch(Exception e){
            System.out.println(e.getMessage());

        }
        System.out.println("Hello yeswanthi");
    }
    
}
