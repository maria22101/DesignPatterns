package behavioral.visitor.taxation;

import java.math.BigDecimal;

public class Tobacco implements Visitable{

    private BigDecimal price;

    public Tobacco(double price) {
        this.price = new BigDecimal(price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
