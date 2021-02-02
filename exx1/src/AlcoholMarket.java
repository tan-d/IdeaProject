import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in) ;
        double priceOfWhiskey = Double.parseDouble(scanner.nextLine()) ;
        double littersBeer = Double.parseDouble(scanner.nextLine()) ;
        double littersWine = Double.parseDouble(scanner.nextLine()) ;
        double littersRakia = Double.parseDouble(scanner.nextLine()) ;
        double littersWhiskey = Double.parseDouble(scanner.nextLine()) ;

        double priceOfRakia = priceOfWhiskey/2 ;
        double priceOfWine = priceOfRakia- (0.4 * priceOfRakia) ;
        double priceOfBeer = priceOfRakia - (0.8 * priceOfRakia) ;

        double sumRakia= littersRakia * priceOfRakia ;
        double sumWine = littersWine * priceOfWine ;
        double sumBeer = littersBeer * priceOfBeer ;
        double sumWhiskey = littersWhiskey * priceOfWhiskey ;
        double total = sumRakia + sumWine + sumBeer + sumWhiskey ;
        System.out.printf( "%.2f", total) ;
    }
}

