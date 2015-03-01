package edu.mit.ll.graphulo;

import org.apache.accumulo.core.data.Value;
import org.apache.accumulo.core.iterators.TypedValueCombiner;
import org.apache.accumulo.core.iterators.user.BigDecimalCombiner;

import java.math.BigDecimal;

/**
 * A multiplication operation on 2 Values. Result is a Value.
 * Will respect order for non-commutative operators.
 */
public interface IMultiplyOp {
    /**
     * A multiplication operation on 2 Values. Result is a Value.
     * Will respect order for non-commutative operators.
     */
    public Value multiply(Value v1, Value v2);




}

// public
class BigDecimalMultiply implements IMultiplyOp {

    private static TypedValueCombiner.Encoder<BigDecimal> encoder = new BigDecimalCombiner.BigDecimalEncoder();

    @Override
    public Value multiply(Value v1, Value v2) {
        BigDecimal d1 = encoder.decode(v1.get());
        BigDecimal d2 = encoder.decode(v2.get());
        BigDecimal res = d1.multiply(d2);
        return new Value(encoder.encode(res));
    }
}