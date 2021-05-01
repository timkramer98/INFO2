import org.junit.Assert;
import org.junit.Test;

public class ObservableAccountTest {
    boolean observerHasBeenNotified;

    /**
     * This is only a minimal test. Not all interesting situations are
     * tested here! You should do your own tests.
     */

    @Test
    public void test1() {
        ObservableAccount account=new ObservableAccount();
        account.addObserver(() -> observerHasBeenNotified=true, 1000);

        observerHasBeenNotified=false;
        account.deposit(1500);
        Assert.assertEquals(1500,account.getBalance());
        Assert.assertTrue(observerHasBeenNotified);
    }

    @Test
    public void test2() {
        ObservableAccount account=new ObservableAccount();
        account.addObserver(() -> observerHasBeenNotified=true, 1000);

        observerHasBeenNotified=false;
        account.deposit(500);
        account.withdraw(1500);
        Assert.assertEquals(500,account.getBalance());
        Assert.assertFalse(observerHasBeenNotified);
    }
}
