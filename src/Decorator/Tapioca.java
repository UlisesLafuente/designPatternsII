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
    public String getCost() {
        return decoratedBubbleTea.getCost()+" +0.50";
    }
}
