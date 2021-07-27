package mocks;

import com.mphasis.cui.ArithmeticMockito;
import com.mphasis.cui.CalculatorService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)


public class MathApplicationTester {

    @Mock
    CalculatorService calculatorService;


    @InjectMocks
    ArithmeticMockito app= new ArithmeticMockito();

    @Test
    public void testAdd(){
        when(calculatorService.add(2.0,4.0)).thenReturn(6.0);

        Assert.assertEquals(app.add(2.4,4.0), 6.0, 0.0);

    }

    @Test
    public void testAddWithNativeValue(){
        when(calculatorService.add(-2.0,4.0)).thenReturn(2.0);

        Assert.assertEquals(app.add(-2.0,4.0),2.0,0.0);
    }


}
