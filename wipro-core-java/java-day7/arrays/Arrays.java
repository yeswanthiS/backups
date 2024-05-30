package arrays;

public class Arrays {
    public static void main(String args[]){
        String[] arr = new String[4];
        arr[0] ="Yeswanthi";
        arr[1] = "Roshith";
        arr[2] = "Lakshy";
        arr[3] = "Rama";
        System.out.println("previous: ");
        for(String str : arr){
            System.out.println(str+" ,");
        }
        System.out.println("\nNew:");
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        for(String str:arr){
            System.out.println(str + " ,");
        }
        System.out.println(arr[arr.length-1]);

    }
    
}
