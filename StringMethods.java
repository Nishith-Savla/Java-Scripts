public class StringMethods {
    public static void main (String[] args) {
        String string = "Some random string";
        System.out.println("To upper case: " + string.toUpperCase());
        System.out.println("Length of the string: " + string.length());
        System.out.println("Compare two strings: " + 
                string.compareTo("some random string with all lowercase letters"));
    }
}
