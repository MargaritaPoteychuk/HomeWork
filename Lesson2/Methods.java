package pvt.java;

public class Methods{

    public int minNumberPrint(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public boolean isNumberEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int squaredNumber(int a) {
        return a * a;
    }

    public double cubeNumber(int a) {
        int b = 3;
        return Math.pow(a, b);
    }
}
