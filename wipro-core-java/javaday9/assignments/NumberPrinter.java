package javaday9.assignments;

public class NumberPrinter {
        public static void main(String[] args) {
            // Create and start the first thread
            Thread thread1 = new Thread(new NumberPrinterRunnable("Thread 1"));
            thread1.start();
    
            // Create and start the second thread
            Thread thread2 = new Thread(new NumberPrinterRunnable("Thread 2"));
            thread2.start();
        }
    }
    
    class NumberPrinterRunnable implements Runnable {
        private String threadName;
    
        public NumberPrinterRunnable(String threadName) {
            this.threadName = threadName;
        }
    
        @Override
        public void run() {
            System.out.println(threadName + " started.");
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " ended.");
        }
    }
    
