package builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderPatternDemo {
	   public static void main(String[] args) {
	   
	      MealBuilderV1 mealBuilder = new MealBuilderV1();

		   List<Item> items = new ArrayList<>();
		   items.add(new VegBurger());
		   items.add(new Fanta());


	      Meal vegMeal = mealBuilder.prepareVegMeal(items);
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	   }
	}
