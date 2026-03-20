package Decorator;

public class Tapioca extends BubbleTeaDecorator {

    public Tapioca(BubbleTea decoratedBubbleTea) {
        super(decoratedBubbleTea);
    }
    @Override
    public String getDescription() {
        return decoratedBubbleTea.getDescription()+ " + Tapioca";
    }

    @Override
    public Cost getCost() {
        Cost cost = decoratedBubbleTea.getCost();
        cost.addToCost(0.50);
        return cost;
    }
}
