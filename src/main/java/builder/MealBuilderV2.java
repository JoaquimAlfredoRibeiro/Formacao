package builder;

import java.util.List;

public class MealBuilderV2 {

    private List<Item> items;


    public static final class MealBuilderV2Builder {
        private List<Item> items;

        private MealBuilderV2Builder() {
        }

        public static MealBuilderV2Builder aMealBuilderV2() {
            return new MealBuilderV2Builder();
        }

        public MealBuilderV2Builder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        public MealBuilderV2 build() {
            MealBuilderV2 mealBuilderV2 = new MealBuilderV2();
            mealBuilderV2.items = this.items;
            return mealBuilderV2;
        }
    }
}
