package tests;

import com.mphasis.cui.Arithmetic;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class ArithmeticTest {
    @Test
    public void testSum(){
        int expectedResult=6;
        Arithmetic arithmetic =new Arithmetic();
        int actualResult = arithmetic.sum(2,4);

        Assert.assertEquals(expectedResult,actualResult);

    } @Test
    public void testMultiply(){
        int expectedResult=8;
        Arithmetic arithmetic =new Arithmetic();
        double actualResult = arithmetic.multiply(2,4);

        Assert.assertEquals(expectedResult,actualResult);

    }

}