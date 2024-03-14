import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReplaceExample {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Mở file đầu vào để đọc
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

            // Mở file đầu ra để ghi
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            // Đọc từng dòng trong file đầu vào
            while ((line = reader.readLine()) != null) {
                // Thay thế từ "Nha Trang" bằng "Vũng Tàu" và ghi vào file đầu ra
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(replacedLine);
                writer.newLine(); // Thêm dòng mới sau mỗi dòng đã thay thế
            }

            // Đóng file
            reader.close();
            writer.close();

            System.out.println("File đã được thay thế và ghi thành công.");
        } catch (IOException e) {
            System.err.println("Đã xảy ra lỗi khi đọc/giữ file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
