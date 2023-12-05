import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File f = null;

        int cool = 0;
        String letter = "";
        String keepTrack = "";

        try {
            f = new File("inputFile");
            Scanner s = new Scanner(f);


            while (s.hasNextLine()) {
                String currentLine = s.nextLine();
                CubeConundrum testing = new CubeConundrum(currentLine);
                System.out.println(testing.blue());
                }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }




    }
}