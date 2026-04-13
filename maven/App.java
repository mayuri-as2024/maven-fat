package maven;

public class App {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    // Method for JUNIT testing
    public static int getFibonacci(int n) {
        if (n <= 1) return n;
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}
