package creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {

        //example of simple prototype
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);

        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of original rabbit: " + rabbit.getAge());
        System.out.println("Age of copied rabbit: " + rabbitCopy.getAge());
        System.out.println("-----------------------------------------");

        //example of complex prototype
        RabbitWithOwner rabbitWithOwner = new RabbitWithOwner();
        rabbitWithOwner.setOwner("Mick");
        RabbitWithOwner rabbitWithOwnerCopy = rabbitWithOwner.clone();

        System.out.println("Name of original rabbit owner: " + rabbitWithOwner.getOwner().getName());
        System.out.println("Name of cloned rabbit owner: " + rabbitWithOwnerCopy.getOwner().getName());
        System.out.println("-----------------------------------------");

        rabbitWithOwnerCopy.getOwner().setName("John");
        System.out.println("Name of original rabbit owner: " + rabbitWithOwner.getOwner().getName());
        System.out.println("Name of cloned rabbit owner: " + rabbitWithOwnerCopy.getOwner().getName());
    }

}
