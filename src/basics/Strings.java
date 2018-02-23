package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoise = "Ring"; 
		bookTitle = "The Lord of the Rings";
	
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word " + wordChoise);
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
		}
		String firstName = "tim"; 
		String lastName = "Short";
		String SSH = "213458565";

		System.out.println("There are " + SSH.length() + " digits in your SSH");

		System.out.println(firstName.substring(0 , 1));
		System.out.println(lastName.substring(0 , 3));
		System.out.println(SSH.substring(5));
	}
}
