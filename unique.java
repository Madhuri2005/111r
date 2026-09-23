import java.util.*;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        boolean unique = true;
        for (int i = 0; i <= 9; i++) {
            int count = 0;
            n = temp;
            while (n > 0) {
                int digit = n % 10;
                if (digit == i) {
                    count++;
                }
                n = n / 10;
            }
            if (count > 1) {
                unique = false;
                break;
            }
        }
        if (unique) {
            System.out.println("unique");
        } else {
            System.out.println("not unique");
        }
    }
}
