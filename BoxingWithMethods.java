public class BoxingWithMethods {
    public static void main (String[] args) {
        Integer integer = 10102;
        System.out.println("To Binary String: " + Integer.toBinaryString(integer));
        System.out.println("Comparing to 10101: " + integer.compareTo(10101));
        System.out.println("Rotate left: " + Integer.rotateLeft(integer, 3));

        Character character = 'S';
        System.out.println("Is digit: " + Character.isDigit(character));
        System.out.println("Comparing to N: " + character.compareTo('N'));
        System.out.println("To upper case: " + Character.toUpperCase(character));

        Boolean bool = Boolean.parseBoolean("false");
        System.out.println("Comparing to true: " + bool.compareTo(true));
        System.out.println("Logical XOR with true: " + Boolean.logicalXor(bool, true));
    }
}
