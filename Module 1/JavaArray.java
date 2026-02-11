import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args){
        int arr[] = {5,3,1,4,6};

        String str = "Cat Dog Ant Rat";

        // max and sum in a array
        int max = arr[0];
        int sum =0;
        for (int x : arr){
            sum+=x; // sum = sum + x
            if (x > max ){
                max =x;
            }
        }
        System.out.println("MAX = "+max);
        System.out.println("SUM = "+sum);



        Arrays.sort(arr);

        for (int x : arr){
            System.out.print(x+ " ");
        }
        System.out.println(Arrays.toString(arr));


    }
}
