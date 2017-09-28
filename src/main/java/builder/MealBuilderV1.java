package builder;

import java.util.ArrayList;
import java.util.List;

public class MealBuilderV1 {

	   public Meal prepareVegMeal (List<Item> items){

           Meal meal = new Meal();

	       for (Item item : items){
	           meal.addItem(item);
           }


	  //   meal.addItem(new VegBurger());
	  //    meal.addItem(new Coke());
	      return meal;
	   }

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
	}
