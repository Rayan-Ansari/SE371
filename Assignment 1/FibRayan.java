import java.util.Scanner;
public class FibRayan {
	public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int previous = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Give a sequence index: ");
        int n = scanner.nextInt();
        
        
        int result = fib(n);
        System.out.println("The Fibonacci number at sequence index " + n + " is: " + result);
        
        
        scanner.close();
    }
}
