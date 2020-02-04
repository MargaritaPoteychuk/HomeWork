package pvt.java;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    public int ageSquare() {
        return this.age * this.age;
    }

    boolean isAgeMoreThen18(){
        if (this.age >= 18 ) {
            return true;
        } else {
            return false;
        }
    }

    private int doubledAge(){
        return this.age * 2;
    }

    protected int tripledAge(){
        return this.age * 3;
    }

    //////////////////////////////
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (int) (23 * age);
    }

    public String toString() {
        return super.toString() + getClass().getName() + " @ " + "age: " + age;
    }

}
