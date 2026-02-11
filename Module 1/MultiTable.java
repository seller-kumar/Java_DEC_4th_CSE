import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a Integer to Display the Multiplication Table :: (Press -100 to exit)");
            int n = scanner.nextInt();
            if (n == -100){
                System.out.println("GoodBye :: Have a great Day !!");
                break;

            } else if (n <= 0){
                System.out.println("ERROR :: Please enter a non-zero positive number");

            } else {
                System.out.println("MULTIPLICATION TABLE OF "+ n);
                for(int i=1; i <=10 ; i++){
                    System.out.println(n +" X "+ i+" = "+ (n*i));
                }
            }
        }

    }
}
