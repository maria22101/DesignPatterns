package structural.decorator.pizza_to_go;

public abstract class Pizza {
    String description = "Basic pizza";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
