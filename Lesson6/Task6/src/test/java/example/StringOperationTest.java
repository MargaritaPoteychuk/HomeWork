package example;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringOperationTest {

    @Test //негативный
    public void testLengthDifference() {
        StringOperation stringOperations = new StringOperation();
        int actualResult = stringOperations.lengthDifference("cherry", "pie");
        int expectedResult = 1;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test //позитывный
    public void testContainsA() {
        StringOperation stringOperation = new StringOperation();
        boolean actualResult = stringOperation.containsA("cat");
        boolean expectedResult = true;
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test //набор параметров
    public void testLengthDivider() {
        StringOperation stringOperation = new StringOperation();
        int actualResult = stringOperation.lengthDivider("congratulations", "text");
        int expectedResult = 3;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEvenNumberOfLetters() {
        StringOperation stringOperation = new StringOperation();
        String actualResult = stringOperation.evenNumberOfLetters("congratulations");
        String expectedResult = "Yes";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEvenNumberOfLetters2() {
        StringOperation stringOperation = new StringOperation();
        String actualResult = stringOperation.evenNumberOfLetters("congratulations");
        String expectedResult = "No";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Ignore
    @Test
    public void testToUpperCase() {
        StringOperation stringOperation = new StringOperation();
        String actualResult = stringOperation.toUpperCase("hello");
        String expectedResult = "HELLO";
        Assert.assertEquals(actualResult, expectedResult);
    }

}