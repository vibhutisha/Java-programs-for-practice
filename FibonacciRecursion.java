public class FibonacciRecursion {

		static int n1 = 0;
		static int n2 = 1;
		static int n3;
		

	public static void main(String[] args){
		int count = 10; // To print n numbers of Fibonacci series
		 
		System.out.print(n1 + " " + n2);
		printFibo(count - 2); 
	}

		 public static void printFibo(int count){
			if(count > 0){
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(" " + n3);
				printFibo(count - 1);

			}
			

		}
		
	
}

