package Decorator;

public abstract class BubbleTeaDecorator implements BubbleTea {

    protected BubbleTea decoratedBubbleTea;

    public BubbleTeaDecorator(BubbleTea decoratedBubbleTea){
        this.decoratedBubbleTea = decoratedBubbleTea;
    }

    @Override
    public String getDescription() {
        return decoratedBubbleTea.getDescription();
    }

    @Override
    public Cost getCost() {
        return decoratedBubbleTea.getCost();
    }
}
