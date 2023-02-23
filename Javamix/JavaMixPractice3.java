package Javamix;

public class JavaMixPractice3 {

	public static void main(String[] args) {


		int St = 0;
		while(St <= 15) {
			System.out.println(St);
			St++;
		}
		
		int St1 = 20;
		while(St1 >= 1) {
			System.out.println(St1);
			St1--;
		}
		 
		int Ab = 3;
		while (Ab <= 30) {
			System.out.println(Ab);
			Ab = Ab+3;
		}
		
		int Bc = 40;
		while( Bc >= 4) {
			System.out.println(Bc);
			Bc = Bc-4;
		}
		
		int Cd = 20;
		while (Cd >= 1 ) {
			System.out.println(Cd);
			if(Cd == 10) {
				break;
			}
			   Cd--;
		}
		
		int De = 20;
		while (De >= 1) {
			if(De==5) {
				break;
			}
			System.out.println(De);
	 	   De--;	
		}
		
		int Ef = 15;
		while (Ef >= 1) {
			if(Ef == 7) {
				Ef--;
				continue;
			}
			System.out.println(Ef);
			Ef--;
		}
		
		String KA = "I am from Kathmanu Nepal";
		for(int i =0; i < KA.length();i++) {
			if(KA.charAt(i) == 'a') {
				System.out.println(i);
			}
		}
		
		int []Gh = {101,102,103,104,105};
		int Sum = 0;
		float Avg = 0;
		for(int i = 0; i < Gh.length;i++) {
			Sum = Sum +Gh[i];
		}
		System.out.println(Sum);
		Avg = Sum/Gh.length;
		System.out.println(Avg);
		
		int I = 100;
		int J = 50;
		
	String Kl = I > J ? "I is greater": "J is greater";
		System.out.println(Kl);
		
		String name = " aerious";
		int count = 0;
		for(int i = 0; i < name.length();i++) {
			if (name.charAt(i) == 'a'||name.charAt(i) == 'e'||name.charAt(i) == 'i'||name.charAt(i) == 'o'||name.charAt(i) == 'u'){
				count = count +1 ;
				System.out.println(name.charAt(i));
			}
		}
		     System.out.println(count);
		
	      	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
