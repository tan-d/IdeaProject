import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        int n=Integer.parseInt( scanner.nextLine() );
        for (var i=0; i<=n; i+=2) {
            n=n*4*4;
            System.out.println( n );

        }
    }
}