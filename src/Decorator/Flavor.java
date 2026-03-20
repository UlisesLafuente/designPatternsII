package Decorator;

public class Flavor extends BubbleTeaDecorator {

    private final String flavor;

    public Flavor(BubbleTea decoratedBubbleTea, String flavor) {
        super(decoratedBubbleTea);
        this.flavor=flavor;
    }

    @Override
    public String getDescription() {
        return decoratedBubbleTea.getDescription()+ " + Flavor: "+flavor;
    }

    @Override
    public Cost getCost() {
        Cost cost = decoratedBubbleTea.getCost();
        cost.addToCost(0.60);
        return cost;
    }
}
