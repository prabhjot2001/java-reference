class StringMethods{
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(s.length()); // returns the length of the string
        System.out.println(s.charAt(2)); // returns the character at index 2
        System.out.println(s.substring(4)); // starting from beginIndex to the last
        System.out.println(s.substring(1, 4)); // starting from beginIndex to the endIndex(excluded)
        System.out.println(s.toUpperCase()); // HELLO WORLD!
        System.out.println(s.toLowerCase()); // hello world!
        System.out.println(s.contains("ell")); // checks if the string contains specified string 
    }
}