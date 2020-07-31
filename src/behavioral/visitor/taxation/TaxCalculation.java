package behavioral.visitor.taxation;

public class TaxCalculation {

    public static void main(String[] args) {

        Visitor taxCalculation = new TaxVisitor();
        Visitor taxHolidayCalculation = new TaxHolidayVisitor();

        Visitable jelly = new Sweets(1.50);
        Visitable brandy = new Alcohol(9.99);
        Visitable malboro = new Tobacco(5.00);

        System.out.println(jelly.accept(taxCalculation));
        System.out.println(brandy.accept(taxCalculation));
        System.out.println(malboro.accept(taxCalculation));

        System.out.println("-----------------------------");

        System.out.println(jelly.accept(taxHolidayCalculation));
        System.out.println(brandy.accept(taxHolidayCalculation));
        System.out.println(malboro.accept(taxHolidayCalculation));

    }
}
