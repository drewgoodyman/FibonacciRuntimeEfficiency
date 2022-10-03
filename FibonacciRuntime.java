
public class FibonacciRuntime {
	
	public static int fibRecursive(int n) {
		if (n == 0) 
			return 0;
		else if (n == 1)
			return 1;
		else return fibRecursive(n - 1) + fibRecursive(n - 2);
	}
	
	public static int fibIterative(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		int num1 = 0, num2 =1, temp = 0;
		for (int i = 0; i <= n; i++) {
			temp = num1 + num2;
			num1 = num2;
			num2 = temp;
		}
		return temp;
	}

	public static void main(String[] args) {
		long startTime, endTime;
		long timeIterative, timeRecursive;
		System.out.println("************************************************************");
		System.out.printf("%1s%10s%8s\n","*", "\tFibonacci Run Time Efficiency In Nanoseconds","*");
		System.out.println("************************************************************");
		System.out.printf("%2s%15s%19s%4s\n", "* Fibonacci Sequence"," * Iterative (ns)","* Recursive (ns)","*");
		System.out.println("************************************************************");
		for (int j = 1; j <= 30; j++) {
			startTime = System.nanoTime();
			fibIterative(j);
			endTime = System.nanoTime();
			timeIterative = endTime - startTime;
			
			startTime = System.nanoTime();
			fibRecursive(j);
			endTime = System.nanoTime();
			timeRecursive = endTime - startTime;
			
			System.out.printf("%1s%3s%18s%8s%11s%8s%11s\n","*", j, "*", timeIterative, "*", timeRecursive, "*");
			}
		System.out.println("************************************************************");

	}

}
