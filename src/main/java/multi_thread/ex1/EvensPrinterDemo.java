package multi_thread.ex1;

public class EvensPrinterDemo {
    public static void main(String[] args) {
        EvensPrinter evensPrinter1 = new EvensPrinter(1000,2000);
        EvensPrinter evensPrinter2 = new EvensPrinter(14300,17800);

        Thread thread1 = new Thread(evensPrinter1);
        Thread thread2 = new Thread(evensPrinter2);

        thread1.start();
        thread2.start();
    }
}
