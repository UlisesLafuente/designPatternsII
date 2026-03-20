package Decorator;

import java.util.ArrayList;
import java.util.List;

public class Cost {
    private List<Double> cost=new ArrayList<>();
    private Double totalCost=0.0;

    public Cost(Double cost){
        this.cost.add(cost);
        calculateTotalCost();
    }

    public void addToCost(double cost){
        this.cost.add(cost);
        calculateTotalCost();
    }

    private void calculateTotalCost(){
        double totalCost = 0;
        for (double cost : this.cost){
            totalCost+=cost;
        }
        this.totalCost=totalCost;
    }

    @Override
    public String toString() {
        String costString="";
        int size=cost.size();
        int i=0;
        for (double cost : this.cost){
            if (i!=0) {
                costString= costString.concat(" +");
            }

            costString= costString.concat(""+ cost);

            if (i==size-1) {
                costString= costString.concat(" = "+ String.format("%.2f",totalCost));
            }
            i++;
        }
        return costString;
    }
}
