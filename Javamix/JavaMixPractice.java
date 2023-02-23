package Javamix;

public class JavaMixPractice {

	public static void main(String[] args) {
		
	        Person  Shrasta = new Person ("Shrasta","Timalsian",20);
	        System.out.println(Shrasta.Firstname);
	         System.out.println(Shrasta.Lastname);
	         System.out.println(Shrasta.age);
	         Shrasta.Talk();
	        Shrasta.walk();
	        Person  Shravan = new Person("Shravan","Timalsina",15);
	        System.out.println(Shravan.Firstname);
	        System.out.println(Shravan.Lastname);
	        System.out.println(Shravan.age);
	        Shravan.walk();
	        Shravan.Talk();

	}

}



         class Person{
	
	       String Firstname;
	       String Lastname;
	       int age ;
	       
	       public   Person(String FN, String LN,int A) {
	    	   this.Firstname = FN;
	    	   this.Lastname = LN;
	    	  this. age      = A;
	    	   
	    	   
	   }
	
	public void walk() {
		System.out.println("I can walk");
	}
	public void Talk() {
		System.out.println("I can Talk");
	}
	
	
	
	
	
	
	
}