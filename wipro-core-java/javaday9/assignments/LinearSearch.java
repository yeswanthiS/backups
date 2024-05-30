package javaday9.assignments;

public class LinearSearch {

        public static int PerformLinearSearch(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i;
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9};
            int x = 5;
            int result = PerformLinearSearch(arr, x);
            if (result == -1) {
                System.out.println("Element not present in array");
            } else {
                System.out.println("Element found at index " + result);
            }
        }
    }
    

