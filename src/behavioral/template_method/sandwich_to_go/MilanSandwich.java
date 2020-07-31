package behavioral.template_method.sandwich_to_go;

public class MilanSandwich extends Sandwich{


    @Override
    void addCheese() {
        System.out.println("Mozzarella cheese added");
    }

    @Override
    void addHam() {
        System.out.println("Prosciutto ham added");
    }

    @Override
    void addVegetables() {
        System.out.println("Tomato, Lettuce and Onion added");
    }
}
