public class Fibonacci {
	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 10; // printing 10 numbers 
		System.out.print(n1 + " " + n2);


		for(int i=2; i<count;i++){
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+ n3);
		}
	}
}

