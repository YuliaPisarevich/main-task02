package by.epam.javatraining.pisarevich.tasks.maintask02.model.logic;

import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Candy;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.ChocolateBar;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.Lollipop;
import by.epam.javatraining.pisarevich.tasks.maintask02.model.entity.container.NewYearGift;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TotalNewYearGiftTest {
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

        newYearGift.setCost(2.0);
        newYearGift.setWeight(0.5);
    }
    @Test
    public void calcTotalCostTest(){
        // cost candy chocolateBars lollipop newYearGift
        //       50.0    110.0        1.0       2.0

        double total = TotalNewYearGift.calcTotalCost(newYearGift);
        double expected = 163.0;

        Assert.assertEquals(expected, total, 0);
    }
    @Test
    public void calcTotalWeightTest(){
        // cost candy chocolateBars lollipop newYearGift
        //       20.0    100.0        10.0       0.5
        double total = TotalNewYearGift.calcTotalWeight(newYearGift);
        double expected = 130.5;

        Assert.assertEquals(expected, total, 0);
    }
}
