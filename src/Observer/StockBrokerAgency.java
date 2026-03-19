package Observer;

public class StockBrokerAgency implements Observer{
    private final String name;
    public StockBrokerAgency(String name) {
        this.name = name;
    }

    @Override
    public void updateUp(StockAgent stockAgent) {
        //Alpha Brokers received notification: Stock market went UP to 150.75
        System.out.println(String.format("%s received notification: Stock market went UP to %.2f",
                this.getName(), stockAgent.getStockMarket()));
    }

    @Override
    public void updateDown(StockAgent stockAgent) {
        System.out.println(String.format("%s received notification: Stock market went DOWN to %.2f",
                this.getName(), stockAgent.getStockMarket()));
    }

    public String getName() {
        return name;
    }
}
