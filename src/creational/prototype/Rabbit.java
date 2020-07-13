package creational.prototype;

public class Rabbit implements Cloneable{

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        LIONHEAD,
        DUTCH
    }

    private int age;
    private Breed breed;

    public Rabbit() {
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
    public Rabbit clone() {
        try {
            return (Rabbit) super.clone();
        }catch (CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
}
