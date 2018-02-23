package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//vamos a crear la variable para definir tu salario
		
		
		//declarar variable 
		String career; 
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career ir: " + career);
		
		//declarar y definir
		int hoursPerWeek = 40; 
		int weekPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weekPerYear * rate;
		System.out.println("My salary as a " + career + "at the rate of $" + rate + " per hour is $ " + salary+ " per year.");
		
		
		//rate + horas por semana + semanas por año
		
		
		
		
	}
}
