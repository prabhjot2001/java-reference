public class MethodBasics{

    public static void printIntArray(int[] a){
        for(int i : a){
            System.out.print(i + " ");
        }
    }

    public void printIntegerArray(int[] a){
          for(int i : a){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        printIntArray(nums);

        MethodBasics obj = new MethodBasics();
        obj.printIntegerArray(nums);
    }
}