package read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileCsv {

    public static void main(String[] args) {
        readFileCsv("src/read_file_csv/countries.csv");
    }

    public  static void readFileCsv (String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] document = line.split(",");
                int id = Integer.parseInt(document[0]);
                String code = document[1];
                String name = document[2];
                System.out.println("Id: " + id + " | Code: " + code + " | Name: " + name);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc có lỗi");
        }
    }
}
