package Builder;

public interface MainCourseBuilder {
    MainCourseBuilder withSuplement(String suplement);
    MainCourseBuilder isVeganMC();
    MainCourseBuilder isGlutenFreeMC();
    DessertBuilder withDessert(String dessert);
    CoffeeBuilder withCoffee(String coffee);
    DrinkBuilder withDrink(String drink);
}
