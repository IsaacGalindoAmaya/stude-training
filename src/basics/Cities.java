package basics;

public class Cities {
	public static void main(String[] args){
		//Declarar y definir un array 
		String[] cities = {"New york", "San Francisco", "Miami", "Dallas" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		System.out.println("---------------");
		//Declarar Array
		String[] countries;

		//Definir el Array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		
		System.out.println("-----------");
		//Declaraci�n de array

		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		//Do loops enter the loop then tests condition 
		do {
			System.out.println("STATE: " + states[i]);	
			i = i + 1;
		} while (i < 5);
		
		System.out.println("-------------");
		//while loop: tests conditional
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state =states [n];
			if (state == "Texas") {
				System.out.println("STATE FOUND: ");
				stateFound = true; 
			} 
			n++;
		}
		System.out.println("imprimiendo con el loop\n");
		//for loop: mejor estructura para integrar
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
		
	}
}
