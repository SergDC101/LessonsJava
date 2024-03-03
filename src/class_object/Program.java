package class_object;


public class Program {
    public static void main(String[] args) {

        Person tom = new Person("Tom");
        Person bob = new Person("Bob");
        Person tom2 = new Person("Tom");

        System.out.println(tom.equals(tom2));
    }
}
