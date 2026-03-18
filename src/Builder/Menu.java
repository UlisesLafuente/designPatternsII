package Builder;

public abstract class Menu {
    private String entrant;
    private String mainCourse;
    private String suplement;
    private String Dessert;
    private String coffe;
    private String Drink;
    private boolean Vegan;
    private boolean GlutenFree;

    public Menu(){
        this.Vegan =false;
        this.GlutenFree =false;
    }

    public String getEntrant() {
        return entrant;
    }

    public void setEntrant(String entrant) {
        this.entrant = entrant;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return Dessert;
    }

    public void setDessert(String dessert) {
        Dessert = dessert;
    }

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public boolean getVegan() {
        return Vegan;
    }

    public Menu setVegan(boolean vegan) {
        Vegan = vegan;
        return this;
    }

    public Menu isVegan() {
        Vegan = true;
        return this;
    }

    public boolean getGlutenFree() {
        return GlutenFree;
    }

    public Menu setGlutenFree(boolean glutenFree) {
        GlutenFree = glutenFree;
        return this;
    }
    public Menu isGlutenFree() {
        GlutenFree = true;
        return this;
    }

    public String getSuplement() {
        return suplement;
    }

    public void setSuplement(String suplement) {
        this.suplement = suplement;
    }

    public String getCoffee() {
        return coffe;
    }

    public Menu setCoffee(String coffee) {
        this.coffe = coffee;
        return this;
    }

    @Override
    public String toString() {
        return "Menu:\n" +
               "  Entrant: " + (entrant != null ? entrant : "none") + "\n" +
               "  Main Course: " + (mainCourse != null ? mainCourse : "none") + "\n" +
               "  Suplement: " + (suplement != null ? suplement : "none") + "\n" +
               "  Dessert: " + (Dessert != null ? Dessert : "none") + "\n" +
               "  Drink: " + (Drink != null ? Drink : "none") + "\n" +
               "  Coffee: " + (coffe != null ? coffe : "none") + "\n" +
               "  Vegan: " + Vegan + "\n" +
               "  GlutenFree: " + GlutenFree;
    }
}
