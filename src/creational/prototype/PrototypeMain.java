package creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);

        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of original rabbit: " + rabbit.getAge());
        System.out.println("Age of copied rabbit: " + rabbitCopy.getAge());
    }

}
