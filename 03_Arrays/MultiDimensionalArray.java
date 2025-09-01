
import java.util.*;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // 2D array
        Scanner sc = new Scanner(System.in);
        int[][] twoDimensionalArray = new int[3][4];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println("enter " + (i + 1) + "st " + (twoDimensionalArray[i].length) + " values");
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = sc.nextInt();
            }
        }

        for (int[] m : twoDimensionalArray) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
