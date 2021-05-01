import java.util.ArrayList;
import java.util.List;

public class ObservableAccount {

    int Account=0;
    int max;
    List<AccountObserver> observerArray = new ArrayList<AccountObserver>();

    public interface AccountObserver {
        void accountHasChanged();
    }

    /**
     * Get the account balance  (franc. "solde")
     * The initial balance of the account is 0.
     *
     * @return The balance
     */
    public int getBalance() {
        System.out.println(Account);
        return Account;

    }

    /**
     * Deposit an amount into the account
     *
     * @param amount The amount to deposit
     */
    public void deposit(int amount) {

        Account+=amount;
    }

    /**
     * Withdraw an amount from the account.
     * An account cannot become negative.
     * If you try to withdraw 1000 Euro from an account that has
     * only 500 Euro, the withdrawal is NOT executed.
     *
     * @param amount The sum to withdraw
     */
    public void withdraw(int amount) {

        if (Account - amount >= max){
            Account -=amount;
            max = amount;
        }
    }

    /**
     * Add an observer to the account.
     * The observer will be notified if an amount is deposited or withdrawn
     * that is greater than the specified maximum.
     * The observer must NOT be notified if the withdrawal is not executed
     * (see comment of the method 'withdraw')
     *
     * The user of this class can change the maximum for an added observer by calling
     * this method again with the same observer. Example:
     *      account.addObserver(myObserver,1000);
     *      account.addObserver(myObserver,2000); // change maximum for this observer
     *
     * @param observer The observer to add.
     * @param maximum The observer will be notified if the deposited or withdrawn
     *                amount is greater than "maximum".
     *
     */
    public void addObserver(AccountObserver observer, int maximum) {

        if (!observerArray.contains(observer)){
            observerArray.add(observer);
        }
        if (max>maximum){
            max = maximum;
            observer.notify();}
    }
}
