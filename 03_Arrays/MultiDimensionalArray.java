
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
        

        // 3D array
        int[][][] threeDimensionalArray = new int[2][3][4];
        for(int x=0; x<threeDimensionalArray.length; x++){
            for(int y=0; y<threeDimensionalArray[x].length; y++){
                for(int z=0; z<threeDimensionalArray[x][y].length; z++){
                    threeDimensionalArray[x][y][z] = sc.nextInt();
                }
            }
        }

        // printing 3D array
        for(int[][] x : threeDimensionalArray){
            for(int[] y : x){
                for(int z : y){
                    System.out.print(z + " ");
                }
                System.out.println();
            }
        }
    }
}
