import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        int numCount=Integer.parseInt( scanner.nextLine() );
        int group1=0;
        int group2=0;
        int group3=0;

        for (int i=1; i<=numCount; i++) {
            int currentNum=Integer.parseInt( scanner.nextLine() );

            if(currentNum%2 == 0){
                group1++;
            }
            if(currentNum%3 == 0){
                group2++;
            }
            if(currentNum%4 == 0){
                group3++;
            }
        }
        System.out.printf( "%.2f%%%n" , 1.0*group1/numCount*100 );
        System.out.printf( "%.2f%%%n" , 1.0*group2/numCount*100 );
        System.out.printf( "%.2f%%%n" , 1.0*group3/numCount*100 );
    }
}
