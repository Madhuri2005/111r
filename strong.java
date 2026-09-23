import java.util.*;

public class strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("strong");
        else

            System.out.println("not strong");
    }
}
