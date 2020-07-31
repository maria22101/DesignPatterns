package structural.adapter.duck_and_drone;

public class DuckSimulator {

    public static void main(String[] args) {
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
