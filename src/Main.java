import java.io.*;

public class Main {
    public static void main(String[] args) {

        String inputFilePath = "src/input.txt";
        String outputFilePath = "src/output.txt";

        try {

            FileReader fileReader = new FileReader(inputFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                // Thay thế từ "Nha Trang" thành "Vũng Tàu" và ghi vào file output.txt
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }


            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("");
        } catch (IOException e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
        }
    }
}
