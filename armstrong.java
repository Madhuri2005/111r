import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int digit = n % 10;
            int rem = digit * digit * digit;
            sum = sum + rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
