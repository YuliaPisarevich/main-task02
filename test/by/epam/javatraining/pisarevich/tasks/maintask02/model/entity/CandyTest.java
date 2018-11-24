package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CandyTest {
    private  Candy candy;
    @Before
    public void init() {
        candy = new Candy("Sweet", 20.0, 50.0, 5.0, "nuts");
    }

    @Test
    public void copyConstructorTest(){
        Candy candy2 = new Candy(candy);
        boolean expected = true;
        boolean actual = candy2.equals(candy);
        assertEquals(expected, actual);

    }
    @Test
    public void getConsistTest() {
        String expected = "nuts";
        String actual = candy.getConsist();
        assertEquals(expected, actual);

    }

    @Test
    public void setConsistTest() {
        String expected = "cookie";
        candy.setConsist("cookie");
        String actual = candy.getConsist();
        assertEquals(expected,actual);
    }

    @Test
    public void equalsTestTrue() {
        Candy candy2 = new Candy("Sweet", 20.0, 50.0, 5.0, "nuts");
        boolean expected = true ;
        boolean actual = candy.equals(candy2);
        assertEquals(expected,actual);

    }
    @Test
    public void equalsTestFalse() {
        Candy candy2 = new Candy("Sweet", 20.0, 50.0, 5.0, "cookie");
        boolean expected = false ;
        boolean actual = candy.equals(candy2);
        assertEquals(expected,actual);

    }

}