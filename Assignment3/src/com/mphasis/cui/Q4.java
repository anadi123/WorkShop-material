class NewThread extends Thread {
  
    NewThread() {
      // Create a new, second thread
      Thread t1=new Thread();
      t1=new Thread(t1,"Demo Thread");
      System.out.println("Child thread: " + this);
      start(); // Start the thread
    }
  
    // This is the entry point for the second thread.
    public void run() {
      try {
        for(int i = 5; i > 0; i--) {
          System.out.println("Child Thread: " + i);
          Thread.sleep(500);
        }
      } catch (InterruptedException e) {
        System.out.println("Child interrupted.");
      }
      System.out.println("Exiting child thread.");
    }
  }
  
class Runner implements Runnable {
    String name; // name of thread
    Thread t;
  
    Runner(String threadname) {
      name = threadname;
      t = new Thread(t, name);
      System.out.println("New thread: " + t);
      t.start(); // Start the thread
    }
  
    // This is the entry point for thread.
    public void run() {
      try {
        for(int i = 5; i > 0; i--) {
          System.out.println(name + ": " + i);
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
        System.out.println(name + "Interrupted");
      }
      System.out.println(name + " exiting.");
    }
  }
  
  class Q4 {//class MultiThreadDemo
    public static void main(String args[]) {
      new NewThread("One"); // start threads
      new NewThread("Two");
      new NewThread("Three");
  
      try {
        // wait for other threads to end
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        System.out.println("Main thread Interrupted");
      }
  
      System.out.println("Main thread exiting.");
    }
  }