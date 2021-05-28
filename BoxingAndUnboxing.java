public class BoxingAndUnboxing {
    public static void main (String[] args) {

        // Byte
        byte primitiveByte = 18;
        Byte byteObject = Byte.valueOf(primitiveByte);
        System.out.println("Boxed Byte: " + byteObject);
        byte unboxedByte = byteObject;
        System.out.println("Unboxed byte: " + unboxedByte);

        // Short  
        short primitiveShort = 18;
        Short shortObject = Short.valueOf(primitiveShort);
        System.out.println("Boxed Short: " + shortObject);
        short unboxedShort = shortObject;
        System.out.println("Unboxed short: " + unboxedShort);
        
        // Integer
        int primitiveInt = 18;
        Integer integerObject = Integer.valueOf(primitiveInt);
        System.out.println("Boxed Integer: " + integerObject);
        int unboxedInt = integerObject;
        System.out.println("Unboxed int: " + unboxedInt);

        // Long
        long primitiveLong = 21436727309466976L;
        Long longObject = Long.valueOf(primitiveLong);
        System.out.println("Boxed Long: " + longObject);
        long unboxedLong = longObject;
        System.out.println("Unboxed long: " + unboxedLong);

        // Float
        float primitiveFloat = 18.46f;
        Float floatObject = Float.valueOf(primitiveFloat);
        System.out.println("Boxed Float: " + floatObject);
        float unboxedFloat = floatObject;
        System.out.println("Unboxed float: " + unboxedFloat);

        // Double
        double primitiveDouble = 18;
        Double doubleObject = Double.valueOf(primitiveDouble);
        System.out.println("Boxed Double: " + doubleObject);
        double unboxedDouble = doubleObject;
        System.out.println("Unboxed double: " + unboxedDouble);

        // Boolean  
        boolean primitiveBoolean = true;
        Boolean booleanObject = Boolean.valueOf(primitiveBoolean);
        System.out.println("Boxed Boolean: " + booleanObject);
        boolean unboxedBoolean = booleanObject;
        System.out.println("Unboxed boolean: " + unboxedBoolean);

        // Character
        char primitiveChar = ' ';
        Character characterObject = Character.valueOf(primitiveChar);
        System.out.println("Boxed Character: " + characterObject);
        char unboxedCharacter = characterObject;
        System.out.println("Unboxed char: " + unboxedCharacter);

    }
}
