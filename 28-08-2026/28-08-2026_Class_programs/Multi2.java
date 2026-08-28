package day2808;


//Lifecycle Demo
class MyTask implements Runnable {

 @Override
 public void run() {
     try {
         System.out.println("Thread state: " + Thread.currentThread().getState());

         Thread.sleep(1000);

     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

public class Multi2 {

 public static void main(String[] args) throws InterruptedException {

     MyTask task = new MyTask();

     Thread t = new Thread(task);

     // NEW state
     System.out.println("After creation: " + t.getState());

     // RUNNABLE state
     t.start();
     System.out.println("After start(): " + t.getState());

     // TIMED_WAITING state
     Thread.sleep(500);
     System.out.println("During sleep: " + t.getState());

     // TERMINATED state
     t.join();
     System.out.println("After completion: " + t.getState());
 }
}