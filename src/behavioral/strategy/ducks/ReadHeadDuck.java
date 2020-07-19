package behavioral.strategy.ducks;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a read-head duck");
    }
}
