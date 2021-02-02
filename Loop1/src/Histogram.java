import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        int n=Integer.parseInt( scanner.nextLine() );
        int counterP1=0;
        int counterP2=0;
        int counterP3=0;
        int counterP4=0;
        int counterP5=0;

        for (int i=1; i<=n; i++) {
            int num=Integer.parseInt( scanner.nextLine());

            if(num<200){
                counterP1++;
            } else if(num<400){
                counterP2++;
            } else if(num<600){
                counterP3++;
            }else if(num<800){
                counterP4++;
            }else if(num>=800){
                counterP5++;
            }
        }
        System.out.printf( "%.2f%%%n" , 100.0*counterP1/n );
        System.out.printf( "%.2f%%%n" , 100.0*counterP2/n );
        System.out.printf( "%.2f%%%n" , 100.0*counterP3/n );
        System.out.printf( "%.2f%%%n" , 100.0*counterP4/n );
        System.out.printf( "%.2f%%%n" , 100.0*counterP5/n );
    }
}