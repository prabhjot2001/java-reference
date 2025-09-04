public class StringBufferDemo{
    public static void main(String... args){
       StringBuffer sb = new StringBuffer("Good");
        sb.append(" Morning");
        sb.insert(4, ",");
        sb.replace(6, 13, "Evening");
        sb.reverse();
        
        System.out.println("StringBuffer result: " + sb);
    }
}