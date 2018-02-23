package basics;

public class NumbersCalc{
	public static void main (String[] args) {
		System.out.println("El programa esta iniciando");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		//System.out.println("El producto de los numeros " + numA + " mas " + numB + " es " + multiplyNumbers(numA, numB));
		System.out.println("El producto de los numeros " + numA + " mas " + numB + " es " + product);
	}

	static void printName(){
		System.out.println("Mi nombre es Isaac");
	}
	static void addNumbers(int numberA, int numberB){
		//esta funcionan agregará dos numeros
		int sum = numberA + numberB;
		System.out.println("la suma de los numeros " + numberA + " mas " + numberB + " es " + sum);
	}
	
	static int multiplyNumbers(int  valueA, int valueB){
		int product = valueA * valueB;
		return product;
	}
	
		
}