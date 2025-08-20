package org.example;

import java.util.ArrayList;
import java.util.List;

class Producer extends App implements Runnable{
    Producer_consumer obj;
    Producer(Producer_consumer obj){
        this.obj=obj;
    }
    @Override
    public void run() {
        try {
            obj.producer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Consumer extends App implements Runnable{
    Producer_consumer obj;
    Consumer(Producer_consumer obj){
        this.obj=obj;
    }
    @Override
    public void run(){
        try {
            obj.consumer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class App {
    public static void main(String[] args) throws InterruptedException {
        Producer_consumer obj = new Producer_consumer();
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
class Producer_consumer{
    List<Integer> buffer = new ArrayList<>();
    public synchronized void producer() throws InterruptedException {
        int capacity=2;
        int i=0;
        while(true){
            System.out.println("Producer added ->" + i);
            buffer.add(i);
            i++;
            Thread.sleep(1000);
            if(buffer.size()==capacity){
                System.out.println("Limit reached for producer and go to waiting stage");
                notify();
                wait();
            }
        }
    }
    public synchronized void consumer() throws InterruptedException {
        while(true){
            System.out.println("Consumer removed ->" + buffer.get(0));
            buffer.remove(0);
            Thread.sleep(1000);
            if(buffer.isEmpty()){
                System.out.println("No items to remove for consumer and go to waiting stage");
                notify();
                wait();
            }
        }
    }
}