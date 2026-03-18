package Builder;

public class MenuBuilder implements ProgressiveMenuBuilder,
                                    EntrantBuilder,
                                    MainCourseBuilder,
                                    DessertBuilder,
                                    CoffeeBuilder,
                                    DrinkBuilder {

    private final Menu menu;

    public MenuBuilder() {
        this.menu = new MenuImpl();
    }

    @Override
    public EntrantBuilder withEntrant(String entrant) {
        menu.setEntrant(entrant);
        return this;
    }

    @Override
    public MainCourseBuilder withMainCourse(String mainCourse) {
        menu.setMainCourse(mainCourse);
        return this;
    }

    @Override
    public EntrantBuilder isVegan() {
        menu.isVegan();
        return this;
    }

    @Override
    public EntrantBuilder isGlutenFree() {
        menu.isGlutenFree();
        return this;
    }

    @Override
    public MainCourseBuilder withSuplement(String suplement) {
        menu.setSuplement(suplement);
        return this;
    }

    @Override
    public MainCourseBuilder isVeganMC() {
        menu.isVegan();
        return this;
    }

    @Override
    public MainCourseBuilder isGlutenFreeMC() {
        menu.isGlutenFree();
        return this;
    }

    @Override
    public DessertBuilder withDessert(String dessert) {
        menu.setDessert(dessert);
        return this;
    }

    @Override
    public CoffeeBuilder withCoffee(String coffee) {
        menu.setCoffee(coffee);
        return this;
    }

    @Override
    public DrinkBuilder withDrink(String drink) {
        menu.setDrink(drink);
        return this;
    }

    @Override
    public Menu build() {
        return menu;
    }
}
