package za.ac.cput.Projects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        Calculator calc = new Calculator();
        Assert.assertEquals(10, calc.calcSum(5,5));
    }
}