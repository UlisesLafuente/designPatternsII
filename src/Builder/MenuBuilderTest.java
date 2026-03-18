package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuBuilderTest {

    @Test
    void testExecutiveMenu() {
        Menu menu = new MenuBuilder()
                .withEntrant("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vedella")
                .withSuplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

        assertEquals("Amanida Mediterrània", menu.getEntrant());
        assertEquals("Filet de Vedella", menu.getMainCourse());
        assertEquals("Guarnició extra", menu.getSuplement());
        assertEquals("Mousse de xocolata", menu.getDessert());
        assertEquals("Vi Negre", menu.getDrink());
        assertTrue(menu.getVegan());
        assertTrue(menu.getGlutenFree());
        assertNull(menu.getCoffee());
    }

    @Test
    void testKidsMenu() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();

        assertNull(menu.getEntrant());
        assertEquals("Macarrons amb tomàquet", menu.getMainCourse());
        assertNull(menu.getSuplement());
        assertEquals("Gelat de Vainilla", menu.getDessert());
        assertEquals("Suc de taronja", menu.getDrink());
        assertFalse(menu.getVegan());
        assertFalse(menu.getGlutenFree());
    }

    @Test
    void testHalfMenuWithCoffee() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Risotto de bolets")
                .isVeganMC()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();

        assertNull(menu.getEntrant());
        assertEquals("Risotto de bolets", menu.getMainCourse());
        assertEquals("Espresso", menu.getCoffee());
        assertNull(menu.getDessert());
        assertEquals("Aigua", menu.getDrink());
        assertTrue(menu.getVegan());
    }

    @Test
    void testVeganEntrant() {
        Menu menu = new MenuBuilder()
                .withEntrant("Ensalada")
                .isVegan()
                .withMainCourse("Pasta")
                .withDrink("Water")
                .build();

        assertTrue(menu.getVegan());
        assertFalse(menu.getGlutenFree());
    }

    @Test
    void testGlutenFreeMainCourse() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Rice")
                .isVeganMC()
                .isGlutenFreeMC()
                .withDrink("Water")
                .build();

        assertTrue(menu.getVegan());
        assertTrue(menu.getGlutenFree());
    }

    @Test
    void testMenuWithSupplement() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Steak")
                .withSuplement("Extra fries")
                .withDrink("Soda")
                .build();

        assertEquals("Extra fries", menu.getSuplement());
        assertNull(menu.getDessert());
    }

    @Test
    void testMenuWithoutDrink() {
        Menu menu = new MenuBuilder()
                .withMainCourse("Soup")
                .withDessert("Cake")
                .build();

        assertEquals("Cake", menu.getDessert());
        assertNull(menu.getDrink());
    }
}
