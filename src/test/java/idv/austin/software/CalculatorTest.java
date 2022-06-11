package idv.austin.software;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1 2 3");
        Assert.assertEquals(6, sum);
    }
}