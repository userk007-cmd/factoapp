
public class Fibonacci05 {
    public static void main(String[] args) {
        int n = 20;
        int first = 0, second = 1;

        System.out.println("First 20 Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
