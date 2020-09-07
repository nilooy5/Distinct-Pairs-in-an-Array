import java.util.Arrays;

public class Pairs {

    public static void main(String[] args) {
        System.out.println("TEST PERFORMED by Munira Tabassum");
        System.out.println("TEST for Distinctive array element pairs");
        System.out.println();
        int[] arr = {8,7,2,34,3,9,14,4,99,99,1,2,3,4,56,5,6};
        PrintPairs(arr);
    }

    private static void PrintPairs(int[] arr) {
        Arrays.sort(arr);
        int previous = 0;
        boolean leftNew = false;

        System.out.println("Current Array");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        for(int i = 0; i < arr.length-1; i++) {
            leftNew = true;
            for(int j = i+1; j < arr.length; j++) {
                if((leftNew || arr[j] != previous) && (arr[i] != arr[j])) {
                    System.out.println(arr[i] + "," + arr[j]);
                    previous = arr[j];
                    leftNew = false;
                }
            }
        }
    }
}
