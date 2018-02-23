package OOP;

class Person{
	String name;
	String email;
	String phone;
	void caminando(){
		System.out.println(name + " esta caminando");
	}
	void comiendo(){
		System.out.println(name + " esta comiendo");
	}
	void durmiendo(){
		System.out.println(name + " esta durmiendo");
	}
}



public class Demo {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "jose";
		person1.email = "jose@q23e2.com";
		person1.phone = "123456789";

		person1.caminando();
		

		Person person2 = new Person();
		person2.name = "mike";
		person2.durmiendo();
		//person2.email = "mike@sfsdfsd";
		//person2.phone = "123456654";

		//person1.comiendo();
		//person1.durmiendo();

		/*
		// TODO Auto-generated method stub
		//Person

		//atributos, variables, adjetios, descrip...
		String name = "joe";
		String email = "joe@gmail.com";
		String phone = "2251548796";

		//action
		//System.out.println(name + "esta caminando");
		caminando(name);
		System.out.println(name + "esta comiendo");
	
		//Como lo sabremos?
		String name2 = "mike";
		String email2 = "mike@gmail.com";
		String phone2 = "00000548796";

		//action, , , ,
		//System.out.println(name2 + " esta caminando");
		caminando(name2);
		System.out.println(name2 + " esta comiendo");

		//que hay de construir atributos y propiedades juntas?


	}
	//agregar funciones para minimizar codigo
	static void caminando(String name){
		System.out.println(name + " esta caminando");
	
	*/
	}
}


