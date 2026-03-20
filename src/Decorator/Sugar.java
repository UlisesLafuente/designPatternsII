package Decorator;

public class Sugar extends BubbleTeaDecorator {

    public Sugar(BubbleTea decoratedBubbleTea) {
        super(decoratedBubbleTea);
    }
    @Override
    public String getDescription() {
        return decoratedBubbleTea.getDescription()+ " + Sugar";
    }

    @Override
    public Cost getCost() {
        Cost cost = decoratedBubbleTea.getCost();
        cost.addToCost(0.30);
        return cost;
    }
}
