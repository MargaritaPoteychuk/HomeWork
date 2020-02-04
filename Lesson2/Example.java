package pvt.java;

public class Example {

    public static void main(String[] args) {
        System.out.println("For Methods class");
        Methods methods = new Methods();
        System.out.println(methods.minNumberPrint(4,7));
        System.out.println(methods.isNumberEven(5));
        System.out.println(methods.squaredNumber(4));
        System.out.println(methods.cubeNumber(3));

        System.out.println("FOR STUDENTS -----------------------------------------");
        Student student = new Student(56);
        Student student1 = new Student(6);
        System.out.println(student.isAgeMoreThen18());
        System.out.println(student.ageSquare());
        System.out.println(student.tripledAge());
        //System.out.println(student.doubledAge); так как метод прайвет
        System.out.println(student.equals(student1));
        System.out.println(student.hashCode());
        System.out.println(student.toString());



    }
}
