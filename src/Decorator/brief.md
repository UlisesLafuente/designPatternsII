

    Implementation of the Decorator pattern for an application of Bubble Tea

Objective

Implement a class design that simulates the customization of a Bubble Tea, using the Decorator design pattern to add ingredients such as pearls, ice, sugar, etc.
Description:

We want to build an application that allows you to create Bubble Teas:

You can start with a base like:

     Latte→ 3.50 €
     Matcha→ 3.20 €
     Tea→ 3.00 €

and you need to add different decorations such as:

     Ice (Ice) → +0.25 €
     Sugar (Sugar) → +0.30 €
     Tapioca (Tapioca) → +0.50 €
     Added flavors (Flavor) → +0.60 € for each flavor added.

    i If two flavors are added, the total cost increases by +1.20€.

Each addition modifies the cost and description of the drink. The objective is to use the Decorator pattern to be able to compose the drinks dynamically, without having to create subclasses for each possible combination.
Requirements:

    Create an interface BubbleTea with the methods:
        String getDescription();
        double getCost();
    Implement the base classes (LatteBase, MatchaBase, TeaBase) that implement BubbleTea. Each base must have a different initial cost and a description of its own.
    Create specific decorators (ex: Ice, Sugar, Tapioca, Flavor) that inherit from BubbleTeaDecorator.
    Each decorator should add to the cost and description of the Bubble Tea.
    Implements unit tests showing the creation of a Bubble Tea with several combinations.

Example of expected use:

```java
public class Main {
public static void main(String[] args) {
BubbleTea tea = new LatteBase(); // base Latte
tea = new Tapioca(tea);
tea = new Sugar(tea);
tea = new Flavor(tea, "Maduixa");
tea = new Flavor(tea, "Mango");

      System.out.println(tea.getDescription());
// Output: Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango
System.out.println(tea.getCost());
// Output: 3.50 +0.50 +0.30 +0.60 +0.60 = 5.50
}
}
```
