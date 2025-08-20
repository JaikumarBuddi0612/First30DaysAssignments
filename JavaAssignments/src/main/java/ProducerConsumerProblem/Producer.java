package ProducerConsumerProblem;

public class Producer implements Runnable{
    SharedBuffer obj;
    Producer(SharedBuffer obj){
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
