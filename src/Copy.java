import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        int []x=arr;
//        x[2]=34;
        int[] deep = Arrays.copyOf(arr, arr.length);

        System.out.println(deep[2]);
        deep[2]=23;
        System.out.println(deep[2]);
        System.out.println(arr[2]);
    }
}