import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int chefs = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double dailyIncomePerChef = (cakes * 45) + (waffles * 5.80) + (pancakes * 3.20);
        double totalDailyIncome = dailyIncomePerChef * chefs;
        double totalIncome = totalDailyIncome * days;
        double moneyForCharity = totalIncome - (totalIncome / 8);

        System.out.printf("%.2f", moneyForCharity);
    }
}
