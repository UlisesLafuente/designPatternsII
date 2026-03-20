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
    public String getCost() {
        return decoratedBubbleTea.getCost()+" +0.30";
    }
}
