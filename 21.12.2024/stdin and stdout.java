
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
