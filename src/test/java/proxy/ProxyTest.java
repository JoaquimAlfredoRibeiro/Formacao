package proxy;

import org.junit.Assert;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void givenFileName_thenImageFileNameIsEqual(){
        Image image = new ProxyImage("test_10mb.jpg");

        Assert.assertEquals(image.getfileName(), "test_10mb.jpg");
    }

    @Test
    public void realImageDisplay(){
        Image image = new RealImage("test_10mb.jpg");

        Assert.assertEquals(image.display(), "Displaying test_10mb.jpg");
    }

    //3 image.get(realImage) |= null
    @Test
    public void realImageDisplayNotNull(){
        Image image = new RealImage("test_10mb.jpg");

        Assert.assertNotNull(image);
    }
}
