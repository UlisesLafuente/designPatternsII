package Decorator;

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