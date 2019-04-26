interface Vehicle {
    public void start(int s);

    public void stop(int s);
}

class Bike implements Vehicle {
    public void start(int s) {
        System.out.println(s + " start");
    }

    public void stop(int s) {
        System.out.println(s + " stop");
    }
}

class Bus implements Vehicle {
    public void start(int s) {
        System.out.println(s + " start");
    }

    public void stop(int s) {
        System.out.println(s + " stop");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start(0);
        bike.stop(0);

        Bus bus = new Bus();
        bus.start(1);
        bus.stop(1);
    }
}