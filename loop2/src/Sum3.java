import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        int sum=0;
        String command=scanner.nextLine();
        while (! command.equals( "Stop" )) {

            int number=Integer.parseInt( command );
            sum+=number;
            command=scanner.nextLine();
        }
        System.out.println( sum );

    }
}