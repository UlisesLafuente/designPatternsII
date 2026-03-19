package Observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private double stockMarket;
    private List<Observer> agencys = new ArrayList<>();

    public void addObserver(Observer agency) {
        this.agencys.add(agency);
    }
    public void removeObserver(Observer agency){
        this.agencys.remove(agency);
    }

    public void stockMarketUp(double stockChange) {
        this.stockMarket=stockChange;
        for (Observer agency : this.agencys){
            agency.updateUp(this);
        }
    }
    public void stockMarketDown(double stockChange) {
        this.stockMarket=stockChange;
        for (Observer agency : this.agencys){
            agency.updateDown(this);
        }
    }

    public double getStockMarket() {
        return stockMarket;
    }
}
