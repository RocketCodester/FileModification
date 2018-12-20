//---------------------------------------------------------------
//         Project
//         CreateFile.java
//         Library class of methods to modify/create files
//---------------------------------------------------------------


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {
        static void createFile() throws IOException {
        String data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());
    }

    /**
     * Create a file in the temp directory with data parameter
     * @param data
     * @throws IOException 
     */    
    static void createFile(String data) throws IOException {
        data = "Test data";
        Files.write(Paths.get("c://temp//testFile3.txt"), data.getBytes());
    }

    /**
     * Write "Test data" to a file parameter
     * @param Filename
     * @throws IOException 
     */
    static void writeToFile(File Filename) throws IOException {
        Files.write(Paths.get(Filename.toString()), "Test data".getBytes());
    }

    /**
     * Write parameter data to a parameter file
     * @param data
     * @param file
     * @throws IOException 
     */
    static void createFile(String data, File file) throws IOException {
        Files.write(Paths.get(file.toString()), data.getBytes());
    }
    
    /**
     * Create a file with user-input filename in the working directory
     * Writes data to the file
     * @throws IOException 
     */
    static File userCreateFile() throws IOException{
        Scanner sc = new Scanner(System.in);
        String path = new File(".").getCanonicalPath()+File.separator+"test"+File.separator;
        System.out.print("Please enter a filename for your file: ");
        File myFile = new File(path + sc.next());
        return myFile;
    }
    /**
     * Write to a parameter file in the working directory
     * @param myFile
     * @throws IOException 
     */
    static void userWriteToFile(File myFile) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter data to write to your file: ");
        Files.write(Paths.get(myFile.toString()), sc.nextLine().getBytes());
    }
}
