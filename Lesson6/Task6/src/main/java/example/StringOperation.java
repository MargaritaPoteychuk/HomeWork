package example;

public class StringOperation {
    public int lengthDifference(String str1, String str2) {
        return str1.length() - str2.length();
    }

    public boolean containsA(String str) {
        return str.contains("a");
    }

    public int lengthDivider(String str1, String str2) {
        return str1.length() / str2.length();
    }

    public String evenNumberOfLetters(String str) {
        if (str.length() % 2 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public int wordLengthDivision(String str, int a) {
        return str.length() / a;
    }

    public int lengthPlusNumber(String str, int number) {
        return str.length() + number;
    }

    public String lengthPlusLength(String str1, String str2, String str3) {
        return "$" + str1 + "$" + str2 + "$" + str3 + "$";
    }

    public int countLengthAndDoubleIt (String str){
        int a = 2;
        return str.length() * a;
    }


}
