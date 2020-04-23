import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        createFile();
//        getFileInfo();
//        readFile();
//        writeFile();
//        readFile();
    }

    public static void createFile() {
        File file = new File("D:\\javademos\\files\\students.text");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya olusturulurdu");
            } else {
                System.out.println("Dosya zaten mevcud");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("D:\\javademos\\files\\students.text");
        if (file.exists()) {
            System.out.println("Dosya adi: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazilabilirmi: " + file.canWrite());
            System.out.println("Dosya yazilabilirmi: " + file.canRead());
            System.out.println("Dosya boyutu: " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("D:\\javademos\\files\\students.text");
        try {
            Scanner reader  = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\javademos\\files\\students.text", true));
            writer.newLine();
            writer.write("Tamerlan");
            System.out.println("Dosyay yazildi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
