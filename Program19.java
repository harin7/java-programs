package cts.harikrishna;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; 
		outside: for (int i = 1; i < 3; i++) { 
			inside: for (int j = 1; j < 3; j++) { 
				System.out.print(j); 
				if (a++ >6) 
					continue inside; 
				break outside; 
				} 
		}

	}

}
