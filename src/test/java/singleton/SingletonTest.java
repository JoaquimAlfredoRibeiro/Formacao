package singleton;


import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void singletonInstancesAreEqual(){

        SingleObject s1 = SingleObject.getInstance();
        SingleObject s2 = SingleObject.getInstance();

        Assert.assertEquals(s1,s2);

    }

    @Test
    public void singletonStringsAreEqual(){

        SingleObject s1 = SingleObject.getInstance();
        SingleObject s2 = SingleObject.getInstance();

        Assert.assertEquals(s1.showMessage(),s2.showMessage());

    }

}
