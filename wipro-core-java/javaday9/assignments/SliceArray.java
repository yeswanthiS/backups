package javaday9.assignments;
import java.util.Arrays;

public class SliceArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 2;
        int end = 5;
        
        int[] slicedArray = sliceArray(array, start, end);
        System.out.println("Sliced array: " + Arrays.toString(slicedArray));
    }
    
    public static int[] sliceArray(int[] array, int start, int end) {
        if (start < 0 || end < start || end >= array.length) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        
        return Arrays.copyOfRange(array, start, end + 1);
    }
}


