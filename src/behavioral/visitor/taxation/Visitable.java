package behavioral.visitor.taxation;

import java.math.BigDecimal;

public interface Visitable {

    public BigDecimal accept(Visitor visitor);
}
