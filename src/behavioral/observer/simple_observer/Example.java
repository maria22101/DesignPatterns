package behavioral.observer.simple_observer;

public class Example {

    public static void main(String[] args) {
        SimpleSubject simpleSubject = new SimpleSubject();
        SimpleObserver observer1 = new SimpleObserver(simpleSubject);
        SimpleObserver observer2 = new SimpleObserver(simpleSubject);
        SimpleObserver observer3 = new SimpleObserver(simpleSubject);

        System.out.print("Observers list: ");
        System.out.println(simpleSubject.getObservers());

        System.out.println("---------------------------");

        System.out.println("Subject sets up a new value: ");
        simpleSubject.setValue(25);

        System.out.println("---------------------------");

        System.out.println("Value that Observers got as update from the Subject:");
        System.out.println("Value of the 1st Observer: " + observer1.getValue());
        System.out.println("Value of the 2nd Observer: " + observer2.getValue());
        System.out.println("Value of the 3rd Observer: " + observer3.getValue());
    }
}
