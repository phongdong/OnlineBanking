import onlinebanking.bank.Bank;
import onlinebanking.customer.Customer;

public class Demo {

	public static void main(String[] args) {
		Bank blueBank = new Bank();
		blueBank.addNewCustomer(new Customer(1, "Phong", "Dong", 100.0, 200.0));
		blueBank.addNewCustomer(new Customer(2, "Ivy", "Tran", 50.0, 150.0));

		System.out.println(blueBank.getCustomer(1l).toString());
		System.out.println(blueBank.getCustomer(2l).toString());

	}

}
