import java.util.*;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give size of 2D array (outer array) ");
        int m = sc.nextInt();
        int[][] jaggedArray = new int[m][];
        for(int i=0; i<m; i++){
            System.out.println("Give size for inner array " + (i+1));
            int n = sc.nextInt();
            jaggedArray[i] = new int[n];
        }

        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = (int) (Math.random()*10);
            }
        }

        for(int[] x : jaggedArray){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
        
    }
}
