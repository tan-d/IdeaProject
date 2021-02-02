import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner=new Scanner( System.in );
        String input=scanner.nextLine();
        int count=0;
        while (! input.equals( "Stop" )) {
            count+=1;
            input=scanner.nextLine();

        }
        System.out.println( count );
    }
}
