package behavioral.visitor.taxation;

import java.math.BigDecimal;

public interface Visitor {

    public BigDecimal visit(Alcohol alcoholItem);

    public BigDecimal visit(Tobacco tobaccoItem);

    public BigDecimal visit(Sweets sweetsItem);
}
