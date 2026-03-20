package Decorator;

public class LatteBase implements BubbleTea {

    @Override
    public String getDescription() {
        return "Latte Bubble Tea";
    }

    @Override
    public Cost getCost() {
        return new Cost(3.5);
    }
}
