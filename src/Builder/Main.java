package Builder;

public class Main {
    public static void main(String[] args){

        Menu executiveMenu = new MenuBuilder()
                .withEntrant("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vedella")
                .withSuplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

        Menu kidsMenu = new MenuBuilder()
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Risotto de bolets")
                .isVeganMC()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();

        System.out.println(executiveMenu.toString());
    }


}
