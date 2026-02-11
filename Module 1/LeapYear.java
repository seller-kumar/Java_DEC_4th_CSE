import java.util.Scanner;

public class LeapYear {


    public static void main(String[] args){
        int year =0;
        Scanner scanner = new Scanner(System.in);

        while ( year != -100){
            System.out.println("Enter a Year to Find if Leap Year :: (Press -100 to exit)");
            year = scanner.nextInt();
            if (year == -100){
                System.out.println("GoodBye :: Have a great Day !!");

            } else if (year <= 0){
                System.out.println("ERROR :: Please enter a non-zero positive year");

            } else {
                if((year%4==0 && year%100!=0) || year%400==0) {
                    System.out.println("RESULT :: "+year+" is a Leap Year");
                } else {
                    System.out.println("RESULT :: "+year+" is NOT a Leap Year");
                }

            }
        }

    }
}
