# Design Patterns II

This project contains three practical exercises demonstrating key design patterns in Java.

## Structure

```
src/
├── Builder/     - Builder pattern with fluent interface and progressive builders
├── Decorator/   - Decorator pattern for dynamic beverage customization
└── Observer/    - Observer pattern for stock market notifications
```

## Design Patterns

### Builder (`src/Builder/`)
Implements the Builder pattern for constructing restaurant menus with:
- Fluent builder interface for expressive object construction
- Progressive interface ensuring correct construction order
- Support for various menu types (executive, kids, half menus)
- Configuration of dish properties (vegan, gluten-free, supplements)

### Decorator (`src/Decorator/`)
Demonstrates the Decorator pattern for a Bubble Tea ordering system:
- Base beverages (Latte, Matcha, Tea) with different costs
- Dynamic addition of decorators (Ice, Sugar, Tapioca, Flavors)
- Each decorator modifies both cost and description
- Eliminates need for subclasses for every possible combination

### Observer (`src/Observer/`)
Implements the Observer pattern for a Stock Exchange notification system:
- StockAgent as the Observable subject
- Multiple StockBrokerAgency observers
- Dynamic subscription and unsubscription
- Automatic notification when stock market values change

## Running the Project

Each module can be compiled and run independently. Use Maven or compile directly with `javac`.

## Requirements

- Java 17+
- 
## License

Apache License 2.0 - See LICENSE file for details.
