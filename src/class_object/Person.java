package class_object;

// toString();
// equals();
// getClass();

// hashCode();
// wait();
// verify();
// verifyAll();

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Person)) return false;

        Person p = (Person)obj;
        return this.name.equals(p.name);
    }


}
