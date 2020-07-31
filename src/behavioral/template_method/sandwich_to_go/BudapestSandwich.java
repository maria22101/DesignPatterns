package behavioral.template_method.sandwich_to_go;

public class BudapestSandwich extends Sandwich{

    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    void addCheese() { }

    @Override
    void addHam() {
        System.out.println("Bacon added");
    }

    @Override
    void addVegetables() {
        System.out.println("Sweet pepper and onion added");
    }
}
