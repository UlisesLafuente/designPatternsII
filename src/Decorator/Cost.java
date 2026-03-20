package Decorator;

import java.util.ArrayList;
import java.util.List;

public class Cost {
    private List<Double> cost=new ArrayList<>();
    private Double totalCost=0.0;

    public Cost(Double cost){
        this.cost.add(cost);
    }

    public void addToCost(double cost){
        this.cost.removeLast();
        this.cost.add(cost);
        calculateTotalCost();
    }

    private void calculateTotalCost(){
        double totalCost = 0;
        for (double cost : this.cost){
            totalCost=++cost;
        }
        this.totalCost=totalCost;
    }

    @Override
    public String toString() {
        String costString=this.cost.get(0).toString();
        int size=cost.size();
        int i=0;
        for (double cost : this.cost){
            if (i == size) {
                costString= costString.concat(" ="+ totalCost);
            } else {
                costString= costString.concat(" +"+ cost);
            }
            i++;
        }
        return costString;
    }
}
