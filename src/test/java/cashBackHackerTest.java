import org.junit.Assert;
import org.junit.Test;
import ru.netology.cashbackhacker.cashBackHacker;


public class cashBackHackerTest {
    ru.netology.cashbackhacker.cashBackHacker cash = new cashBackHacker();
    @Test
    public void boundaryTest(){
        int amount = 2500;

        int expected = 500;
        int actual = cash.remain(amount);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void boundaryTest1(){
        int amount = 0;

        int expected = 1000;
        int actual = cash.remain(amount);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void boundaryTest12(){
        int amount = 1000;

        int expected = 0;
        int actual = cash.remain(amount);
        Assert.assertEquals(expected,actual);

    }
}
