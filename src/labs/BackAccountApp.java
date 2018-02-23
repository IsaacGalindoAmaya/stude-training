package labs;

public class BackAccountApp {

	public static void main(String[] args) {
		BackAccount acc1 = new BackAccount("465329874", 1000.50);
		BackAccount acc2 = new BackAccount("654987444", 2000);
		BackAccount acc3 = new BackAccount("321456987", 4000);
		
		acc1.setName("Jimbo");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}

class BackAccount implements IInterest {
	
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "00540068";
	private String name;
	private String SSN;
	private double balance;
	
	//Contructor 
	public BackAccount(String SSN, double initDeposit){
		balance = initDeposit;
		//System.out.println("¡Nueva cuenta creada! ");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
		
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("tu numero de cuenta: " + accountNumber);
	}
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance = balance+amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("balance: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance  * (1 + rate/100);
		showBalance(); 
	}
	public String toString() {
		return "[Name : " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance " + balance + "]"; 
	}
	
}