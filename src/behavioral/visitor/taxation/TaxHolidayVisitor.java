package behavioral.visitor.taxation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxHolidayVisitor implements Visitor{

    @Override
    public BigDecimal visit(Alcohol alcoholItem) {
        System.out.print("Alcohol item, holiday price with tax: ");
        BigDecimal priceWithoutTax = alcoholItem.getPrice();
        BigDecimal alcoholHolidayTaxRate = new BigDecimal(".05");

        return priceWithoutTax
                .multiply(alcoholHolidayTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal visit(Tobacco tobaccoItem) {
        System.out.print("Tobacco item, holiday price with tax: ");
        BigDecimal priceWithoutTax = tobaccoItem.getPrice();
        BigDecimal tobaccoHolidayTaxRate = new BigDecimal(".12");

        return priceWithoutTax
                .multiply(tobaccoHolidayTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal visit(Sweets sweetsItem) {
        System.out.print("Sweet item, holiday price with tax: ");
        BigDecimal priceWithoutTax = sweetsItem.getPrice();
        BigDecimal sweetsHolidayTaxRate = new BigDecimal(".00");

        return priceWithoutTax
                .multiply(sweetsHolidayTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
