package abstract_test;

import java.util.EventListener;

public class Cat extends Animal implements Printable {

    private int height;
    public Cat(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }


    @Override
    public void voice() {

    }
}
