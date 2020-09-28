// reading files
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Sample_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("samples/big.txt");
        Scanner fileReader = new Scanner(file);
        while(fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            System.out.println(data);
        }
        fileReader.close();
    }
}