import java.util.Scanner;

public class PalinString {
    public static void main(String[] args){
        String wrd ="";
        Scanner scanner = new Scanner(System.in);

        while ( !wrd.equals("-100")){
            System.out.println("Enter a word to check Palindrome  :: (Press -100 to exit)");
            wrd = scanner.nextLine();

            if (wrd.equals("-100")){
                System.out.println("GoodBye :: Have a great Day !!");

            }  else {
                String strrev = new StringBuilder(wrd).reverse().toString();
                if(wrd.equals(strrev)){
                    System.out.println(wrd+ " is String Palindrome");
                } else {
                    System.out.println(wrd+ " is NOT String Palindrome");
                }



                int vowels = 0, consonants = 0, digits = 0, special = 0;
                wrd = wrd.toLowerCase();
                for (int i = 0; i < wrd.length(); i++) {
                    char ch = wrd.charAt(i);

                    if (ch >= 'a' && ch <= 'z') {
                        if ("aeiou".indexOf(ch) != -1)
                            vowels++;
                        else
                            consonants++;
                    }
                    else if (ch >= '0' && ch <= '9') {
                        digits++;
                    }
                    else {
                        special++;
                    }
                }
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
                System.out.println("Digits: " + digits);
                System.out.println("Special Characters (including white space): " + special);




            }
        }

    }
}
