package creational.prototype;

public class RabbitWithOwner implements Cloneable {

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public RabbitWithOwner() {
    }

    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public RabbitWithOwner clone() {
        try {
            RabbitWithOwner rabbitWithOwnerClone = (RabbitWithOwner) super.clone();
            rabbitWithOwnerClone.owner = owner.clone();
            return rabbitWithOwnerClone;
        } catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
