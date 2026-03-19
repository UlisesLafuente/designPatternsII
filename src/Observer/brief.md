Observer Pattern
What is it?

The Observer pattern is a behavioral design pattern that defines a one-to-many dependency relationship between objects, so that when an object changes state, all its dependents are automatically notified.

In other words, it allows you to define a subscription mechanism to notify multiple objects about any event that happens to the object they are observing.
Utility

The Observer pattern is useful when:

     We need to automatically notify several components when a change of status occurs.
     Changes in the state of an object can affect others, but we do not know which or how many objects at the time of encoding.
     We need other objects to be added or dynamically removed as observers, depending on the context.
     We want to implement pub-sub-type systems pub-sub(publisher / subscriber).

Purpose

     Allow all observers to be automatically notified when the Observable changes status.
     You can enter new subscriber classes without having to modify the code of the notifying class (and vice versa if there is a notifying interface).
     Establish relationships between objects during the execution time, adding or removing observers as necessary.
     Allow to keep the components uncoupled, since the Observable should not know the internal logic of its observers.

Exercise:

    Implementing Observer pattern in a Exchange Exchange Notification System

Objective

Build a system in which a Stock Exchange Agent (Observable) automatically notifies multiple Stock Exchange agencies (Observers) each time a change in the status of the Stock Exchange occurs (up or down).
Description

    Design a class StockAgent that:
        Allow observers to subscribe and cancel the subscription.
        Have methods to simulate when the stock market goes up or down the stock value.
        When the stock market goes up or down, it automatically notifies all observers with a message indicating the change and new value of the shares.
    He also designed several specific classes of observers that:
        Register for the StockAgent.
        When notified, show the notification message on the screen indicating whether the bag has gone up or down and the current value.

Requirements

    The Observable object must have references to its observers.
    It should be possible to add and remove observers dynamically.
    When the AgentBorsa changes status (up or down), it must call to notifyObservers().
    Each observer must show the received message.
    The program must be tested through Unitary Tests the:
        subscription of several observers to the stockbroker.
        simulation of ups and downs of the bag.
        serification that observers receive and correctly display the expected messages.

Example of an expected test (simplified):

@Test
public void testStockAgentNotifications() {
StockAgent agent = new StockAgent();

Observer alphaBrokers = new StockBrokerAgency("Alpha Brokers");
Observer zenithInvestments = new StockBrokerAgency("Zenith Investments");

agent.addObserver(alphaBrokers);
agent.addObserver(zenithInvestments);

agent.stockMarketUp(150.75);
// Expected console output:
// Alpha Brokers received notification: Stock market went UP to 150.75
// Zenith Investments received notification: Stock market went UP to 150.75

agent.stockMarketDown(145.50);
// Expected console output:
// Alpha Brokers received notification: Stock market went DOWN to 145.50
// Zenith Investments received notification: Stock market went DOWN to 145.50
}
