package ss14_io_text.excersice.excersice1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceText = "ss14_io_text/excersice/excersice1/SourceText";
        String cloneText = "ss14_io_text/excersice/excersice1/TargetFile";
        List<String> data = readFile(sourceText);
        StringBuilder text = new StringBuilder();

        for (String item : data){
            text.append(item).append("\n");
        }

        text.deleteCharAt(text.length() -1);
        writeFile(cloneText, text.toString());
    }

    public static List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader reader =  new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;

        while ((line = bufferedReader.readLine())!=null){
            list.add(line);
        }
        return list;
    }

    public static void writeFile(String path, String data) throws IOException {
        File file = new File(path);
        FileWriter writer =  new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(data);
        bufferedWriter.close();
    }
}

