package javaday10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // Read
        File f = new File("./names1.txt");
        try {
            f.createNewFile(); // create
            f.deleteOnExit(); // delete
            FileWriter fw = new FileWriter(f);
            fw.append("Aaryan is a Trainer");
            
            fw.close();
        } catch (IOException e) {
            System.out.println("File not found");
            // e.printStackTrace();
        }
    }
    
}
