package multi_thread.ex2;

public class Bridge {
    synchronized public void driveThrough(Car car){
        System.out.println(car.getName() + " is riding through Bridge.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Car crashed!");
            return;
        }
        System.out.println(car.getName() + " leaved Bridge.");
    }
}
