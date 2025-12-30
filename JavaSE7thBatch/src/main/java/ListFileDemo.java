
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbook
 */
public class ListFileDemo {
    public static void main(String[] args) {
        Path path = Path.of("./src/main/java/com/turing/javase7/javase7thbatch/chapter23");
        try(DirectoryStream<Path> dir = Files.newDirectoryStream(path))
        {
            for(Path p : dir)
            {
                System.out.println("Name "+p.getFileName());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
