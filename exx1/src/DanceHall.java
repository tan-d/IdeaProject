import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        double length = Double.parseDouble(scanner.nextLine()) ;
        double width  = Double.parseDouble(scanner.nextLine()) ;
        double side= Double.parseDouble(scanner.nextLine()) ;
        double area = (length * 100)*(width * 100) ;
        double wardrobe = (side * 100)*( side * 100) ;
        double bench = area/10 ;
        double freeArea= (area- wardrobe - bench)/( 40 + 7000 ) ;
        double dancers = Math.floor( freeArea );
        System.out.printf( "%.0f", dancers ) ;
    }
}
