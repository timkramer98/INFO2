public class Launcher {

    /*
     * Instantiate and start each thread from "t" with its OWN Counter object,
     * then wait for all threads to finish and return the set of Counter objects
     * the threads ran on. Each thread must be named according to its index in the
     * "t" array.
     */
    public static Counter[] init(Thread[] t){
      Counter[] counter = new Counter[t.length];
      for (int x = 0; x < t.length; x++){
          counter[x] = new Counter();
          t[x] = new Thread(counter[x], Integer.toString(x));
          t[x].start();
      }
      for (Thread thread: t){
          try{
              thread.join();
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      return counter;
    }
}
