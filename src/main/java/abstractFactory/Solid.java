package abstractFactory;

public class Solid implements Line {

    @Override
    public void drawLine() {
        System.out.println("Inside Solid::draw() method.");
        System.out.println("__________");
    }
}
