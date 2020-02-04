package pvt.java;

public class Person extends ExampleAbstr{
    public int age;

    public Person(int age){
        this.age = age;
    }

    public void printAge() {
        System.out.println(age);;
    }


    @Override
    public void abstractMethod() {
    }
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
        Person person = (Person) obj;
        if (age != person.age) {
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
