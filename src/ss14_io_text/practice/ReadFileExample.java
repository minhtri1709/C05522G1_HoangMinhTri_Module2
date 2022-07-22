package ss14_io_text.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            //Đọc file theo hướng dẫn
            File file = new File(filePath);

            //Kiểm tra nếu file không tồn tại thì ném ra exception
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            //Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();

            //Hiển thị ra màn hình tổng các số nguyên
            System.out.println("Tổng = " + sum);

        }catch (Exception e){
            //th file không tồn tại hoặc nội dung file có lối
            System.out.print("File không tồn tại hoặc nội dung có lỗi");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:  ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
