package proxy;

import org.junit.Assert;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void givenFileName_thenImageFileNameIsEqual(){
        Image image = new ProxyImage("test_10mb.jpg");

        Assert.assertEquals(image.getfileName(), "test_10mb.jpg");
    }

}
