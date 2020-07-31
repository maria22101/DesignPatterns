package behavioral.template_method.sandwich_to_go;

public abstract class Sandwich {

    //we mark the method final for preventing subclasses from changing it:
    final void makeSandwich() {
        cutBaguette();
        spreadButter();
        if(customerWantsCheese()) {
            addCheese();
        }
        if(customerWantsHam()) {
            addHam();
        }
        if(customerWantsVegetables()) {
            addVegetables();
        }
        wrapTheSandwich();
    }

    //we fix the necessary steps that are not to be changed:
    public void cutBaguette() {System.out.println("Baguette cut");}
    public void spreadButter() {System.out.println("Butter spread");}
    public void wrapTheSandwich() {System.out.println("Sandwich wrapped \n");}

    //we force subclasses to implement the below abstract methods:
    abstract void addCheese();
    abstract void addHam();
    abstract void addVegetables();

    //we give possibility for subclasses to override the below methods according to their customers needs:
    boolean customerWantsCheese() {return true;}
    boolean customerWantsHam() {return true;}
    boolean customerWantsVegetables() {return true;}
}
