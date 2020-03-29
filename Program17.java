package cts.harikrishna;

public class Program17 {
	static int x = 4; 
	int y; 
	public Program17(int a,int b) { 
		this.x=a; 
		this.y=b; 
		System.out.println("Value of  x :"+this.x);   
		System.out.println("Value of  y :"+this.y);   
		Program17(); 
		} 
	public static void testMethod() {   
		System.out.print(this.x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {   
			new Program17(5,10); 
			Test Mytest=new Program17(); 
			Mytest.testMethod(); 
		}

	}

}
