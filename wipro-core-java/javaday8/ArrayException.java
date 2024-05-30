package javaday8;

public class ArrayException {
    public static void main(String args[]) throws myException{
        int[] arr = new int[3];
        arr[0] =0;
        arr[1]=1;
        arr[2]=2;
        for(int i=0; i<=arr.length; i++){
            try{
                System.out.println(arr[i]);
            }catch(Exception e){
                throw new myException("Index doesn't exist" +i);

            }
        }
    }
    
}
class myException extends Exception{
    public myException(String errMsg){
        super(errMsg);
    }
}
