package ProducerConsumerProblem;

class Consumer implements Runnable{
    SharedBuffer obj;
    Consumer(SharedBuffer obj){
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