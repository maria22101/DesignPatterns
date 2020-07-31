package behavioral.strategy.ducks;

public class DuckSimulator {

    public static void main(String[] args) {

        Duck redHead = new ReadHeadDuck();
        redHead.display();
        redHead.performFly();
        redHead.performQuack();
        redHead.swim();


        System.out.println("------------------------");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();

    }
}
