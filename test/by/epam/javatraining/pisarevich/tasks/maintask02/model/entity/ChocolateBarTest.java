package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChocolateBarTest {

    ChocolateBar chocolateBar;

    @Before
    public void initTest() {
        chocolateBar = new ChocolateBar("Choch", 100.0, 110.0,
                10.0, "white");
    }
    @Test
    public void copyConstructorTest(){
        ChocolateBar chocolateBar2 = new ChocolateBar(chocolateBar);
        boolean expected = true;
        boolean actual = chocolateBar2.equals(chocolateBar);
        assertEquals(expected, actual);

    }
    @Test
    public void getTypeOfChocolateTest() {
        String expected = "white";
        String actual = chocolateBar.getTypeOfChocolate();
        assertEquals(expected, actual);

    }

    @Test
    public void setTypeOfChocolateTest() {
        String expected = "black";
        chocolateBar.setTypeOfChocolate("black");
        String actual = chocolateBar.getTypeOfChocolate();
        assertEquals(expected,actual);
    }

    @Test
    public void equalsTestTrue() {
        ChocolateBar chocolateBar2 = new ChocolateBar("Choch", 100.0, 110.0,
                10.0, "white");

        boolean expected = true ;
        boolean actual = chocolateBar2.equals(chocolateBar);
        assertEquals(expected,actual);

    }
    @Test
    public void equalsTestFalse() {
        ChocolateBar chocolateBar2 = new ChocolateBar("Choch", 100.0, 110.0,
                10.0, "black");
        boolean expected = false ;
        boolean actual = chocolateBar2.equals(chocolateBar);
        assertEquals(expected,actual);
    }


}