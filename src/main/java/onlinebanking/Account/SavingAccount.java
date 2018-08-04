package onlinebanking.account;

import javax.persistence.Id;

public class SavingAccount implements Account{

    @Id
    private int id;
    private double balance;

    public SavingAccount() {
    }

    public SavingAccount(int id) {
    }

    public int getId() {
        return 0;
    }

    public void setId(int id) {

    }

    public double getBalance() {
        return 0;
    }

    public void setBalance(double balance) {

    }
}
