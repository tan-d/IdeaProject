import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        int numbersCount=Integer.parseInt( scanner.nextLine() );
        int maxNum=Integer.MIN_VALUE;
        int sum=0;

        for (int i=1; i<=numbersCount; i++) {
            int currentNumber=Integer.parseInt( scanner.nextLine() );
            sum+=currentNumber;
            if(maxNum<currentNumber){
                maxNum=currentNumber;
            }
        }
        int sumWithoutMaxNum=sum - maxNum;
        if(maxNum == sumWithoutMaxNum){
            System.out.println( "Yes" );
            System.out.printf( "Sum = " + maxNum );
        } else{
            int diff=Math.abs( maxNum - sumWithoutMaxNum );
            System.out.println( "No" );
            System.out.printf( "Diff = " + diff );

        }
    }
}
