import org.junit.jupiter.api.BeforeAll;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CalculatorForPpiTest {
    private  int width;
    private int height;
    private double size;
    @BeforeClass
    public void init(){
        width=750;
        height=1334;
        size=4.7;
    }

    @Test
    public void testCase1(){
        Assert.assertEquals(326,CalculatorForPpi.calculate(width,height,size));
    }
    @Test
    public void testCase2(){
        Assert.assertEquals(-1,CalculatorForPpi.calculate(0,height,size));
    }

}