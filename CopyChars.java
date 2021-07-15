import java.io.*;
import java.util.*;

class CopyChars {

    public static void main(String arg[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name: ");
        String sourceFile = sc.next();
        System.out.print("Provide destination file name: ");
        String destinationFile = sc.next();
        FileReader fileReader = new FileReader(sourceFile);
        FileWriter fileWriter = new FileWriter(destinationFile, true);
        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
        }
        System.out.println("Copied");
        fileReader.close();
        fileWriter.close();
    }
}   
