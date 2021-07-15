import java.io.*;
import java.util.*;

class CopyBytes {

    public static void main(String arg[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide source file name: ");
        String sourceFile = sc.next();
        System.out.print("Provide destination file name: ");
        String destinationFile = sc.next();
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
        byte b;
        while ((b = (byte)fileInputStream.read()) != -1) {
            fileOutputStream.write(b);
        }
        System.out.println("Copied");
        fileInputStream.close();
        fileOutputStream.close();
    }
}   
