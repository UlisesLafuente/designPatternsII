package Decorator;

public class LatteBase implements BubbleTea {

    @Override
    public String getDescription() {
        return "Latte Bubble Tea";
    }

    @Override
    public String getCost() {
        return "3.5";
    }
}
