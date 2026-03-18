package Builder;

public interface DessertBuilder {
    DrinkBuilder withDrink(String drink);
    Menu build();
}
