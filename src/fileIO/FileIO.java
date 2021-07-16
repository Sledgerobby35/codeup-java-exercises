package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        Path path = FileDirectoryUtil.getPath("src","fileIO","files");
        FileDirectoryUtil.tryCreateDirectory(path);

        //Try to create the file
        path = Paths.get(path.toString(), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        //Print out the final location of the file
        System.out.println(path.toAbsolutePath());

        //Try to print the contents of file before we write
        IOUtil.tryPrintContent(path);

        //Try to write to the file
        IOUtil.tryWriteToFile(getContent(), path);

        //Try to print the content of the file after we write
        IOUtil.tryPrintContent(path);
    }

    public static List<String> getContent(){
        List<String> contentToWrite = new ArrayList<>();
        contentToWrite.add("This is a new line");
        contentToWrite.add("This is another line");
        contentToWrite.add("Another nother line");
        return contentToWrite;
    }
}
