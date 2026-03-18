Exercise:

    Implementing the Builder pattern in a restaurant menu.

Objective

Design and implement a system to build different types of restaurant menus applying the Builder design pattern with Fluent Builder style, and following the SOLID principles. In addition, the concept of progressive interface will be used, which consists of progressively limiting the options available to the user during the construction of the object, thus ensuring that the process is carried out in the correct order and the dependencies are met between steps. For example, you can not add dessert before adding the main course, nor can you call the method of adding desserts more than once.
Description

In the menus can be composed of:

    Appetizers
    Main Course
    Dessert
    Drink

These can have specific characteristics:

    Any dish can be: Vegan and/or Suitable for celiacs.
    The main course may have a supplement (for example: extra garnish).
    In addition, the customer can order only the middle menu, which includes only the main course and the drink.
    The children's menu includes no more main course, drink and dessert.
    The menus can be without drink.
    The desserts are optional for all menus and can be dessert or coffee.

Requirements:

    Model a flexible system to build step-by-step menus, without specific class dependencies, that guarantees the correct and mandatory order in the construction of the menu. For example, you will not be able to add dessert before adding the main course.
    Implement a restriction by which, if you choose dessert, you will not be able to add coffee, and vice versa. This rule must be guaranteed thanks to the design of interfaces.
    Allow to configure the properties of the dishes (vegan, suitable for celiacs, supplement) with fluent and expressive methods, avoiding Boolean parameters.
    Implements unit tests showing the creation various menus:

Menú:
 - Entrant: Amanida Mediterrània (Vegan) (Gluten Free)
 - Plat Principal: Filet de Vedella, Suplement: Guarnició extra
 - Postres: Mousse de xocolata
 - Beguda: Vi Negre

Example of expected use:

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
        .isVegan()
    .withCoffee("Espresso")
    .withDrink("Aigua")
    .build();
