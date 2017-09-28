package singleton;


public class SingleObject {

    static int a =0;

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the constructor private so that this class cannot be
    //instantiated
    private SingleObject() {
    }

    //Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public String showMessage() {

        String a = "Hello World";
        System.out.println(a);
        return a;
    }

    public int counter(){
        a++;
        return a;
    }



}