package chapter12;

import java.io.FileNotFoundException;

public class WriteDataDemo {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("scores.txt");
        if(file.exists() ){
            System.out.println("file exists");
            System.exit(0);
        }
        // create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // write to the file
        output.print("Charlie Brown");
        output.println(12);
        output.print("Snoopy");
        output.println(2);

        // close the file
        output.close();
    }
}
