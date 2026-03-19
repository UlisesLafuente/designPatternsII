package Observer;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ObserverTest {
    @Test
    public void testStockAgentNotifications() {
        StockAgent agent = new StockAgent();

        Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
        Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

        agent.addObserver(alphaBrokers);
        agent.addObserver(zenithInvestments);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        agent.stockMarketUp(150.75);
        String output = outputStream.toString();

        assertTrue(output.contains("Alpha Brokers"));
        assertTrue(output.contains("Zenith Investments"));
        assertTrue(output.contains("UP to 150,75"));

        outputStream.reset();

        agent.stockMarketDown(145.50);
        output = outputStream.toString();

        assertTrue(output.contains("Alpha Brokers"));
        assertTrue(output.contains("Zenith Investments"));
        assertTrue(output.contains("DOWN to 145,50"));

        System.setOut(originalOut);
    }
}
