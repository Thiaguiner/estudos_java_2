package fileWriter_bufferWriter;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String [] lines = new String[] {"Good morning, Good afternoon, Good night"};

        String path = "c:\\Users\\thiag\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
