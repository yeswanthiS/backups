package javaday9.assignments;

public class Fibonicci {
        public static int fibonacci(int n, int[] arr) {
            if (n == 0) {
                arr[n] = 0;
                return 0;
            } else if (n == 1) {
                arr[n] = 1;
                return 1;
            } else {
                arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
                return arr[n];
            }
        }
    
        public static void main(String[] args) {
            int n = 10;
            int[] arr = new int[n];
            fibonacci(n - 1, arr);
            System.out.println("The first " + n + " elements of the Fibonacci sequence are:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
