package behavioral.observer.simple_observer;

public class SimpleObserver implements Observer{
    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    private void display() {
        System.out.println("Value: " + value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SimpleObserver";
    }
}
