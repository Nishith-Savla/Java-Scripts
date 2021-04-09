class TypeCastingExample {
    public static void main(String[] args) {
        int totalMarks = 500;

        // Implicit Type Casting (int -> double)
        double percentage = 75;
        
        // Explicit Type Casting (double -> int)
        int marksObtained = (int)(percentage/100 * 500);

        System.out.println(percentage + "% of " + totalMarks + " is " + marksObtained);
    }
}
