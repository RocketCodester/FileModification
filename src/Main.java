//---------------------------------------------------------------
//         Project
//         Main.java
//         Main class to test CreateFile.java
//         Tests writing data to a newly created file
//---------------------------------------------------------------

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException  {
        CreateFile f = new CreateFile();
        f.userWriteToFile(f.userCreateFile());
        Integer[] array = {1,2,3,4,5,6};

        System.out.println(Arrays.asList(array).indexOf(4));
    }
}
