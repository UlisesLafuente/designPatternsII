package Decorator;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Nested
    class CostTest {
        @Test
        void constructor_initializesWithSingleValue() {
            Cost cost = new Cost(3.50);
            assertEquals("3.5 = 3,50", cost.toString());
        }

        @Test
        void addToCost_addsSingleValue() {
            Cost cost = new Cost(3.50);
            cost.addToCost(0.50);
            assertEquals("3.5 +0.5 = 4,00", cost.toString());
        }

        @Test
        void addToCost_addsMultipleValues() {
            Cost cost = new Cost(3.50);
            cost.addToCost(0.50);
            cost.addToCost(0.30);
            cost.addToCost(0.60);
            assertEquals("3.5 +0.5 +0.3 +0.6 = 4,90", cost.toString());
        }

        @Test
        void toString_formatsCorrectly() {
            Cost cost = new Cost(10.0);
            assertEquals("10.0 = 10,00", cost.toString());
        }
    }

    @Nested
    class LatteBaseTest {
        @Test
        void getDescription_returnsLatteBubbleTea() {
            BubbleTea tea = new LatteBase();
            assertEquals("Latte Bubble Tea", tea.getDescription());
        }

        @Test
        void getCost_returnsCorrectPrice() {
            BubbleTea tea = new LatteBase();
            assertEquals("3.5 = 3,50", tea.getCost().toString());
        }
    }

    @Nested
    class BubbleTeaDecoratorTest {
        @Test
        void constructor_setsDecoratedBubbleTea() {
            BubbleTea base = new LatteBase();
            BubbleTeaDecorator decorator = new Sugar(base);
            assertNotNull(decorator);
        }
    }

    @Nested
    class FlavorTest {
        @Test
        void constructor_acceptsBubbleTeaAndFlavor() {
            BubbleTea base = new LatteBase();
            Flavor flavor = new Flavor(base, "Mango");
            assertNotNull(flavor);
        }

        @Test
        void getDescription_appendsFlavor() {
            BubbleTea base = new LatteBase();
            Flavor flavor = new Flavor(base, "Mango");
            assertEquals("Latte Bubble Tea + Flavor: Mango", flavor.getDescription());
        }

        @Test
        void getCost_addsFlavorPrice() {
            BubbleTea base = new LatteBase();
            Flavor flavor = new Flavor(base, "Mango");
            assertEquals("3.5 +0.6 = 4,10", flavor.getCost().toString());
        }

        @Test
        void multipleFlavors_accumulateCost() {
            BubbleTea tea = new LatteBase();
            tea = new Flavor(tea, "Maduixa");
            tea = new Flavor(tea, "Mango");
            assertEquals("Latte Bubble Tea + Flavor: Maduixa + Flavor: Mango", tea.getDescription());
            assertEquals("3.5 +0.6 +0.6 = 4,70", tea.getCost().toString());
        }
    }

    @Nested
    class SugarTest {
        @Test
        void getDescription_appendsSugar() {
            BubbleTea base = new LatteBase();
            Sugar sugar = new Sugar(base);
            assertEquals("Latte Bubble Tea + Sugar", sugar.getDescription());
        }

        @Test
        void getCost_addsSugarPrice() {
            BubbleTea base = new LatteBase();
            Sugar sugar = new Sugar(base);
            assertEquals("3.5 +0.3 = 3,80", sugar.getCost().toString());
        }
    }

    @Nested
    class TapiocaTest {
        @Test
        void getDescription_appendsTapioca() {
            BubbleTea base = new LatteBase();
            Tapioca tapioca = new Tapioca(base);
            assertEquals("Latte Bubble Tea + Tapioca", tapioca.getDescription());
        }

        @Test
        void getCost_addsTapiocaPrice() {
            BubbleTea base = new LatteBase();
            Tapioca tapioca = new Tapioca(base);
            assertEquals("3.5 +0.5 = 4,00", tapioca.getCost().toString());
        }
    }

    @Nested
    class IntegrationTest {
        @Test
        void singleDecorator() {
            BubbleTea tea = new LatteBase();
            tea = new Tapioca(tea);
            assertEquals("Latte Bubble Tea + Tapioca", tea.getDescription());
            assertEquals("3.5 +0.5 = 4,00", tea.getCost().toString());
        }

        @Test
        void multipleDecorators() {
            BubbleTea tea = new LatteBase();
            tea = new Tapioca(tea);
            tea = new Sugar(tea);
            assertEquals("Latte Bubble Tea + Tapioca + Sugar", tea.getDescription());
            assertEquals("3.5 +0.5 +0.3 = 4,30", tea.getCost().toString());
        }

        @Test
        void fullCombination() {
            BubbleTea tea = new LatteBase();
            tea = new Tapioca(tea);
            tea = new Sugar(tea);
            tea = new Flavor(tea, "Maduixa");
            tea = new Flavor(tea, "Mango");

            assertEquals("Latte Bubble Tea + Tapioca + Sugar + Flavor: Maduixa + Flavor: Mango", tea.getDescription());
            assertEquals("3.5 +0.5 +0.3 +0.6 +0.6 = 5,50", tea.getCost().toString());
        }
    }
}
