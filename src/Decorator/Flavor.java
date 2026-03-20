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
    public String getCost() {
        return decoratedBubbleTea.getCost()+" +0.60";
    }
}
