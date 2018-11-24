package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic.extremumnewyeargift;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static by.epam.javatraining.pisarevich.tasks.maintask02.model.logic.extremumnewyeargift.ExtremumCost.*;

public class ExtremumCostTest {
    private Candy candy;
    private ChocolateBar chocolateBar;
    private Lollipop lollipop;
    private NewYearGift newYearGift;

    @Before
    public void init(){
        candy = new Candy("Sweet", 20.0, 50.0, 5.0, "");
        chocolateBar = new ChocolateBar("Choch", 100.0, 110.0, 10.0, "white");
        lollipop = new Lollipop("Loli", 10.0, 1.0, 2.0, "apple");
        newYearGift = new NewYearGift();
        newYearGift.add(candy);
        newYearGift.add(lollipop);
        newYearGift.add(chocolateBar);
    }
    @Test
    public void findMinCostTest() {
        // cost candy chocolateBars lollipop
        //      50.0    110.0           1.0
        double expected = 1.0;
        double actual = findMinCost(newYearGift);
        Assert.assertEquals(expected, actual, 0);

    }
    @Test
    public void findMaxCostTest() {
        // cost candy chocolateBars lollipop
        //      50.0    110.0           1.0
        double expected = 110.0;
        double actual = findMaxCost(newYearGift);
        Assert.assertEquals(expected, actual, 0);

    }
}
