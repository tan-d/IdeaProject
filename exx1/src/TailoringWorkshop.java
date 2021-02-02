
 import java.util.Scanner;

    public class TailoringWorkshop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numTables = Integer.parseInt(scanner.nextLine());
            double lengthTables = Double.parseDouble(scanner.nextLine());
            double widthTables = Double.parseDouble(scanner.nextLine());

            double lengthTablecloth = lengthTables + 0.60;
            double heightTablecloth = widthTables + 0.60;
            double careSide = lengthTables / 2;

            double areaTablecloth = numTables * lengthTablecloth * heightTablecloth;
            double areaCare = numTables * careSide * careSide;

            double dollarPrice = areaTablecloth * 7 + areaCare * 9;
            double levaPrice = dollarPrice * 1.85;

            System.out.printf("%.2f USD %n", dollarPrice);
            System.out.printf("%.2f BGN", levaPrice);
        }
    }

