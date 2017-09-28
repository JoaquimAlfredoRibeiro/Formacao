package proxy;

public class ProxyPatternDemo {
	
	   public static void main(String[] args) {

	      Image image = new ProxyImage("test_10mb.jpg");
	      //1 image.get(fileName) == "test_10mb.jpg"

	      //image will be loaded from disk
	      image.display();

	      //2 image.display() = "displaying" + "test_10mb.jpg"

		  //3 image.get(realImage) |= null

	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	   }
	}