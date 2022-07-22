package ss14_io_text.excersice.excersice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCountry {
    public static void main(String[] args) throws IOException {
        File file = new File("ss14_io_text/excersice/excersice2/Country");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        String[] info;

        List<Country> countries = new ArrayList<>();
        while ((line = bufferedReader.readLine()) !=null){
            info = line.split(",");
            countries.add(new Country(Integer.parseInt(info[0]), info[1],info[2]));
        }
        bufferedReader.close();

       for (Country country : countries){
           System.out.println(country.getInfo());
       }
    }
}
