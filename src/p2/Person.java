package p2;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this. age = age;
    }

    @Override
    public String toString() {
        return "Person" + name;


    }
     @Override
    public boolean equals(Object o) { //метод equals
        if (this == o) return true;
        if( !(o instanceof Person)) return false;

        if (o == null || getClass() != o.getClass() ) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
