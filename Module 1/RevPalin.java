import java.util.Scanner;

public class RevPalin {
    public static void main(String[] args){
        int num =0;
        Scanner scanner = new Scanner(System.in);

        while ( num != -100){
            System.out.println("Enter a Number to Reverse and Check Palindrome  :: (Press -100 to exit)");
            num = scanner.nextInt();
            int temp = num;
            if (num == -100){
                System.out.println("GoodBye :: Have a great Day !!");

            }  else {
                int rev=0;
                while(num!=0){
                    rev=rev*10+num%10;
                    num/=10;
                }
                System.out.println("REVERSE :: Reverse of "+temp+" is "+rev);
                if(temp == rev) {
                    System.out.println("Palindrome :: "+temp +" is a Palindrome");
                } else {
                    System.out.println("Palindrome :: "+temp +" is NOT a Palindrome");
                }


            }
        }

    }
}
