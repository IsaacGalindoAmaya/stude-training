package labs;

public class lab2 {
	 public static void main(String[] args) {
	        // creación de usuarios
	   Student acc1 = new Student("Margarita", "10001234"); 
	   Student acc2 = new Student("Alejandra", "10001235");
	   Student acc3 = new Student("Emmanuel", "10001236");
	   
	   acc1.enroll("Español");
	   acc2.enroll("Matematicas");
	   acc3.enroll("Ciencias");
	   
	   acc1.payTuition(600);
	 
	   System.out.println(acc1.toString());
	     }
	  }
	       class Student {  
	      private static int iD=1;
	      private String userId;
	      private String name;
	      private String ssn;
	      private String email;
	public String getPhone() {
	    return phone;
	}

	public void setPhone(String phone) {
	this.phone = phone;
	}

	public String getCity() {
	return city;
	}

	public void setCity(String city) {
	this.city = city;
	}

	public String getState() {
	return state;
	}

	public void setState(String state) {
	this.state = state;
	}
	private String phone;
	      private String city;
	      private String state;
	      private String courses = " ";
	      private static final int costOfCourse = 1000;
	      private int balance = 0;       
	 
	    public Student (String name, String ssn) {
	         iD++;
	         this.name = name;
	         this.ssn = ssn;
	         setUserId();
	         setEmail();
	       }
	    
	     private void setAccountID() {

	       }
	     
	     private void setEmail ()  {
	     email = name.toLowerCase() + "@m3.com";
	       System.out.println("Correo: " + email);
	       }     
	     private void setUserId()  {
	    int max = 90;
	    int min = 10;
	    int randNum =(int) (Math.random() * ((max - min)));
	     randNum = randNum + min; 
	     userId = iD + randNum + ssn.substring(6);
	     System.out.println("ID de usuario: "  + userId);
	        }
	     public void enroll(String course)  {
	     this.courses = this.courses + "\n" + course;
	     balance = balance + costOfCourse;     
	        }
	     
	     public void payTuition(int amount)   {
	     System.out.println("Payment: $" + amount); 
	     balance = balance + amount;
	         }     
	     public void checkBalance() {
	     System.out.println("Balance: " + balance);     
	         }        
	     public void showCourses()  {  
	     System.out.println(courses);
	         }
	     public String toString()   {
	     return "[Nombre: " + name + " ]\n" + "[Cursos: " + courses + "]\n" + "[Balance: "  + balance + "]";
	    }
	}
