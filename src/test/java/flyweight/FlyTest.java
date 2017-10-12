package flyweight;

import org.junit.Assert;
import org.junit.Test;

public class FlyTest {

    @Test
    public void shapeFactory_sameColor_returnsSameInstance() {

        Circle c1 = (Circle) ShapeFactory.getCircle("Red");
        c1.setX(10);
        c1.setY(10);
        c1.setRadius(100);
        //c1.draw();

        Circle c2 = (Circle) ShapeFactory.getCircle("Red");
        c2.setX(20);
        c2.setY(20);
        c2.setRadius(100);
        //c2.draw();

        Assert.assertTrue(c1.getX() == c2.getX());
    }

    @Test
    public void shapeFactoryClone_sameColor_returnsDiffInstance() {

        Circle c1 = (Circle) ShapeFactoryClone.getCircle("Red");
        c1.setX(10);
        c1.setY(10);
        c1.setRadius(100);
        //c1.draw();

        Circle c2 = (Circle) ShapeFactoryClone.getCircle("Red");
        c2.setX(20);
        c2.setY(20);
        c2.setRadius(100);
        //c2.draw();

        Assert.assertTrue(c1.getX() != c2.getX());
    }

}
