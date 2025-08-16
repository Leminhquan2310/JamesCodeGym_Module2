package copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadAndWriteFile {

    public static void main(String[] args) {
        ReadAndWriteFile rw = new ReadAndWriteFile();
        List<String> listNumbers = rw.readFile("numbers.txt");
        System.out.println(Arrays.toString(listNumbers.toArray()));
        rw.writeFile("resultForCopyFile.txt", listNumbers);
    }

    public void writeFile(String filePath, List<String> data) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder writeData = new StringBuilder();
            for (String t : data) {
                writeData.append(t + "\n");
            }
            bufferedWriter.write(writeData.toString());
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> readFile (String filePath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader  bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }
        return list;
    }
}
