import java.util.*;

public class duck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        boolean duck = false;
        while (n > 0) {
            int digit = n % 10;

            if (digit == 0) {
                duck = true;
            }
            n = n / 10;
        }

        if (duck) {
            System.out.println(temp + " it is a duck number");
        } else {
            System.out.println(temp + "it's not a duck number");
        }

    }
}
