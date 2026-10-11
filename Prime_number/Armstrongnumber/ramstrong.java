
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int order = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, order);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
