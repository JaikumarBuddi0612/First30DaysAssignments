package ProducerConsumerProblem;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer obj = new SharedBuffer();
        Producer p1= new Producer(obj);
        Thread t1= new Thread(p1);
        Consumer c1 = new Consumer(obj);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
