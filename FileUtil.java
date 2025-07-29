package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static void simpanData(String filename, List<String> data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (String line : data) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error menyimpan file: " + e.getMessage());
        }
    }
    
    public static List<String> bacaData(String filename) {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error membaca file: " + e.getMessage());
        }
        return data;
    }
}
