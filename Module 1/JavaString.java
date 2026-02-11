import java.util.Scanner;


public class JavaString {
    //recursive function or method to find factorial of a given number
    static int fact(int n){
        if( n == 1) {
            return 1;
        } else {
            return n* fact(n-1);
        }
    }
    static int fibo(int n){
        if( n == 0) {
            return 0;
        } else if( n == 1) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number of find factorial");
        int n = s.nextInt();
        int r=fact(n);
        System.out.println("Factorial of "+n+" is "+r);

        System.out.println("Fibonicci Series of "+n+" term ::");
        for(int i=0;i < n; i ++){
            System.out.print(fibo(i)+ " " );
        }
    }
}
