import java.util.Scanner;

public class MaxNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int number = 1;

        while (number <= n) {
            int value = Integer.parseInt(scanner.nextLine());
            if(value > max) {
                max = value;
            }
            number++;
        }System.out.println(max);

    }
}
