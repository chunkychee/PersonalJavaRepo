package Lesson3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    final static int count =3;
    final static int repeat =4;

    final static CyclicBarrier cyclicbarrier = new CyclicBarrier(count,() -> System.out.println("All Done"));
    //3 threads will print all done when threads are done.

    static class Task implements Runnable{
        int taskID;
        Task(int id){
            taskID = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < repeat; i++) {
                System.out.println("thread " + taskID + "done");
                try {
                    cyclicbarrier.await();
                } catch (InterruptedException e) {
                    System.err.println("thread interrupted");
                } catch (BrokenBarrierException e) {
                    System.err.println("broken barrier");
                }
            }

            }
        }

    public static void main(String[] args) {
        for (int i = 0; i<count; i++){
            new Thread(new Task(i)).start();
        }
    }
}
