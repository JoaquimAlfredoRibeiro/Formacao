package builder;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void itWorks(){

        Meal meal = Meal.MealBuilder.instance()
                .withItems(new Fanta())
                .withItems(new VegBurger())
                .build();

        Assert.assertNotNull(meal);

    }

}
