package example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringOperation3Test {
    @Test
    public void testLengthPlusNumber() {
        StringOperation stringOperation = new StringOperation();
        int actualResult = stringOperation.lengthPlusNumber("kitty", 3);
        int expectedResult = 8;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider
    public Object[][] getStrings() {
        return new Object[][]{
                {"a", "b", "c", "$a$b$c$"},
                {"vv", "aa", "", "$vv$aa$$"},
                {"yes", "no", "cat", "$yes$no$cat$"}
        };
    }

    @Test(dataProvider = "getStrings")
    public void testConcat(String str1, String str2, String str3, String expectedResult) {
        StringOperation stringOperations = new StringOperation();
        String actualResult = stringOperations.lengthPlusLength(str1, str2, str3);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
