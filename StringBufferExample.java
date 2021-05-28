public class StringBufferExample {
    public static void main (String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("string is implemented using StringBuffer");
        sb.insert(0, "This ");
        sb.setCharAt(5, 'S');
        System.out.println("The string thus formed is: " + sb.toString());
    }
}
