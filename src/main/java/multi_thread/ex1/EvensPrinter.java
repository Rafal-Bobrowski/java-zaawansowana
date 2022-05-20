package multi_thread.ex1;

public class EvensPrinter implements Runnable{

    int from;
    int to;

    public EvensPrinter(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " number: " + i);
            }
        }
    }
}
