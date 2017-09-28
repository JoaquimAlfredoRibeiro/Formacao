package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

   private List<Item> items = new ArrayList<Item>();

    public static final class MealBuilder {
        private List<Item> items = new ArrayList<Item>();

        private MealBuilder() {
        }

        public static MealBuilder instance() {
            return new MealBuilder();
        }

        public MealBuilder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public MealBuilder withItems(Item items) {
            this.items.add(items);
            return this;
        }

        public Meal build() {
            Meal meal = new Meal();
            meal.items = this.items;
            return meal;
        }
    }



    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
