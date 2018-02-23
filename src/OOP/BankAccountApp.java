package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// creando una nueva cuenta bancaria
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Isaac ";
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123456");
		System.out.println("SSN: " + acc1.getSsn());

		acc1.accountNumber = "123456";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();

		acc1.deposit(1500);
		/*acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
*/
		System.out.println(acc1.toString());



		
		
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "226815712";
		
		BankAccount acc3 = new BankAccount("Saving account", 50000);
		acc3.accountNumber = "5568465";
		/*
		acc3.checkBalance();

		//CDAccount
		CDAccount cd1 = new CDAccount();
		cd1.balance= 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juanito";
		cd1.accountType = "CD account";
		System.out.println(cd1.toString());	
		cd1.compount();
		*/
	}

}