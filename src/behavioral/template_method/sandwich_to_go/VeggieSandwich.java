package behavioral.template_method.sandwich_to_go;

public class VeggieSandwich extends Sandwich{


    @Override
    boolean customerWantsCheese() {
        return false;
    }

    @Override
    boolean customerWantsHam() {
        return false;
    }

    @Override
    void addCheese() { }

    @Override
    void addHam() { }

    @Override
    void addVegetables() {
        System.out.println("Grilled pepper, tomato and onion");
    }
}
