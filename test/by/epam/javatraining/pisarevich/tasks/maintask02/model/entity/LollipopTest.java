package by.epam.javatraining.pisarevich.tasks.maintask02.model.entity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LollipopTest {

    private Lollipop lollipop;

    @Before
    public void init() {
        lollipop = new Lollipop("Loli", 10.0, 1.0, 2.0, "apple");

    }
    @Test
    public void copyConstructorTest(){
        Lollipop lollipop2 = new Lollipop(lollipop);
        boolean expected = true;
        boolean actual = lollipop2.equals(lollipop);
        assertEquals(expected, actual);

    }
    @Test
    public void getTasteTest() {
        String expected = "apple";
        String actual = lollipop.getTaste();
        assertEquals(expected, actual);

    }

    @Test
    public void setTasteTest() {
        String expected = "orange";
        lollipop.setTaste("orange");
        String actual = lollipop.getTaste();
        assertEquals(expected,actual);
    }

    @Test
    public void equalsTestTrue() {
        Lollipop lollipop2 = new Lollipop("Loli", 10.0, 1.0, 2.0, "apple");
        boolean expected = true ;
        boolean actual = lollipop2.equals(lollipop);
        assertEquals(expected,actual);

    }
    @Test
    public void equalsTestFalse() {
        Lollipop lollipop2 = new Lollipop("Loli", 10.0, 1.0, 2.0, "orange");
        boolean expected = false ;
        boolean actual = lollipop2.equals(lollipop);
        assertEquals(expected,actual);
    }



}