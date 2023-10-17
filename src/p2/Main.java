package p2;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ivan", 30);
        System.out.println(person.toString());// или toString
        System.out.println(person.hashCode());
        Person person1 = new Person("Ivan", 25);
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode());

    }
}
