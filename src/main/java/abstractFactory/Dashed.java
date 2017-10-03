package abstractFactory;

public class Dashed implements Line {

    @Override
    public void drawLine() {
        System.out.println("Inside Dashed::draw() method.");

        System.out.println("_ _ _ _ _ _ _ _");
    }
}
