package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringOperation2Test {

    @Test(expectedExceptions = ArithmeticException.class) //искл
    public void testWordLengthDivision() {
        StringOperation stringOperation = new StringOperation();
        int actualResult = stringOperation.wordLengthDivision("congratulations", 0);
        int expectedResult = 4;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountLengthAndDoubleIt(){
        StringOperation stringOperation = new StringOperation();
        int actualResult = stringOperation.countLengthAndDoubleIt("hello");
        int expectedResult = 10;
        Assert.assertEquals(actualResult, expectedResult);
    }
}
