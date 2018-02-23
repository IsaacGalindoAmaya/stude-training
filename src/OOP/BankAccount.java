package OOP;

public class BankAccount implements IRate{
	String accountNumber;

	//final es la constante seguida de static 
	private static final String routingNumber = "654879"; 

	//variables de instancias
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;

	//contructor definitions
	BankAccount(){
		System.out.println("new account creater");
	}
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);	
		String Msg = null; 
		if(initDeposit < 1000){
			Msg = "Erro: el deposito minimo debe de ser de $1,000";
		} else {
			Msg = "Gracias por su apertura de: $ " + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}

	//allow the user to define the name

	public void setName (String name){
		//this.name = name;
		this.name = "Mr. " + name;
		
	}
	public String getName(){
		return name;
		
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//interface methods 
	public void setRate() {
		System.out.println("Inicio Rate: ");
	}
	
	public void increaseRate() {
		System.out.println("Incremento Rate: ");
		
	}
	
	//define metodos
	public void deposit(double amount){	
		balance = balance +  amount;
		showActivity("DEPOSITO / deposit");
		
	}
	void withdraw(double amount){	
		balance = balance +  amount;
		showActivity("RETIRAR / withdraw");

	}

	private void showActivity(String activity){
		System.out.println("Tu transacción resiente: " + activity);
		System.out.println("Tu nuevo balance es: " + balance);
	}

	void checkBalance(){
		System.out.println("Tu balance es: " + balance);
	}

	void getStatus(){

	}
	@Override
	public String toString(){
		return "[ Nombre:" +  name + " . Cuenta" + accountNumber + "Enrutamiento " + " routingNumber # " +", BALANCE + " +  balance + "]" ;
	}
}
