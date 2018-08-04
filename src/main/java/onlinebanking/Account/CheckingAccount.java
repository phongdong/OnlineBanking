package onlinebanking.account;

import javax.persistence.Id;

public class CheckingAccount implements Account{

    @Id
    private int id;
    private double balance;

    public CheckingAccount() {
    }

    public CheckingAccount(int id) {

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
