package behavioral.visitor.taxation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxVisitor implements Visitor{

    @Override
    public BigDecimal visit(Alcohol alcoholItem) {
        System.out.print("Alcohol item, price with tax: ");
        BigDecimal priceWithoutTax = alcoholItem.getPrice();
        BigDecimal alcoholTaxRate = new BigDecimal(".10");

        return priceWithoutTax
                .multiply(alcoholTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal visit(Tobacco tobaccoItem) {
        System.out.print("Tobacco item, price with tax: ");
        BigDecimal priceWithoutTax = tobaccoItem.getPrice();
        BigDecimal tobaccoTaxRate = new BigDecimal(".20");

        return priceWithoutTax
                .multiply(tobaccoTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal visit(Sweets sweetsItem) {
        System.out.print("Sweet item, price with tax: ");
        BigDecimal priceWithoutTax = sweetsItem.getPrice();
        BigDecimal sweetsTaxRate = new BigDecimal(".08");

        return priceWithoutTax
                .multiply(sweetsTaxRate)
                .add(priceWithoutTax)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
