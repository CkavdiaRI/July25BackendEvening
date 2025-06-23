package StreamsAndLambdas.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    // Method to read file content
    public void readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        System.out.println("Reading File: " + fileName);
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
