package facade;

public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;
	   private Oval oval;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
	   public void drawOval(){oval.draw();}
	}
