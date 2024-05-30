 package javaday9.assignments;
 import java.util.Arrays;

 public class BruteForceSort {
     public static void main(String[] args) {
         int[] array = initializeArray(10); // Create an array of size 10
         System.out.println("Original array: " + Arrays.toString(array));
         
         bruteForceSort(array); // Sort the array using brute force
         System.out.println("Sorted array: " + Arrays.toString(array));
     }
     
     // Function to initialize an array with random values
     public static int[] initializeArray(int size) {
         int[] array = new int[size];
         for (int i = 0; i < size; i++) {
             array[i] = (int) (Math.random() * 100); // Random values between 0 and 99
         }
         return array;
     }
     
     // Brute force sorting function
     public static void bruteForceSort(int[] array) {
         int n = array.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (array[j] > array[j + 1]) {
                     // Swap array[j] and array[j+1]
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                 }
             }
         }
     }
 }