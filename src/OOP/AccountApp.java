package OOP;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(28);
		
	IRate account1 = new LoanAccount();
	account1.increaseRate();
	account1.setRate();
	}

}
