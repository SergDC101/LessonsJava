package Main;

public class Person {


    private int id;
    private final static int COUNTER = 0;


    public static int getCounter(){
        return COUNTER;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
