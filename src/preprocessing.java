package src;

import java.io.*;
import java.util.Scanner;

public class preprocessing {

    public static void main(String[] args) throws Exception {
        // Reading and Writing a file
        File file = new File("resources/input.txt");
        File output_file = new File("resources/output.txt");
        BufferedReader bufRdr = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output_file));
        String line = null;

        try {
            while ((line = bufRdr.readLine()) != null) {
                // read line by line and append some string to the line
                writer.write(line + " checked.");
                writer.newLine();
            }
        } catch (IOException e) {
            // ...
            //
        }
        writer.close();
        bufRdr.close();

    }
}
