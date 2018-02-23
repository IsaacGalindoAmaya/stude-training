package basics;

public class Weather {
	public static void main(String[] args) {
		//Este programa regresará la sugerencias basadas en temperatura y condiciones de sol
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, Perhaps wear a long-sleeve and jeans");
			System.out.println("wear a hat to keep the sun out of your eyes.");
		}
		else if ((temperature > 50)|| (sunCondition == "Overcast")) {
			System.out.println("Es un día muy frio, asegurate de estar en un lugar calido");
		}
		
		else {	
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		
		
		System.out.println("El programa termino.");
		
	}
	
}
