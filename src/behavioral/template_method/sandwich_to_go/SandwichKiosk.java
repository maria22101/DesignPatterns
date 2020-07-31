package behavioral.template_method.sandwich_to_go;

public class SandwichKiosk {

    public static void main(String[] args) {

        Sandwich sandwich1 = new MilanSandwich();
        System.out.println("------Milan sandwich------");
        sandwich1.makeSandwich();

        Sandwich sandwich2 = new BudapestSandwich();
        System.out.println("------Budapest sandwich------");
        sandwich2.makeSandwich();

        Sandwich sandwich3 = new VeggieSandwich();
        System.out.println("------Vegetarian sandwich------");
        sandwich3.makeSandwich();

    }
}
