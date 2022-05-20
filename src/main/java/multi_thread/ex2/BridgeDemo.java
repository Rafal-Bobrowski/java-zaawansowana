package multi_thread.ex2;

public class BridgeDemo {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        Car car1 = new Car("BMW", "Cabrio");
        Car car2 = new Car("Volvo", "Suv");

        Thread thread1 = new Thread(() -> bridge.driveThrough(car1));
        Thread thread2 = new Thread(() -> bridge.driveThrough(car2));

        thread2.start();
        thread1.start();
    }

}
