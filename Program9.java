package cts.harikrishna;

public class Program9 {
	public static void main(String []args) {
		int x = 0, y = 0; 
		if ((y == x++) | (x < ++y)) { 
			++y; 
			} 
		System.out.println(x + "" + y);
	}

}
