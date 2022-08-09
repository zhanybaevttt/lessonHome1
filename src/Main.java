import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    //    File file =new File("Text.txt");
        FileWriter fileWriter=new FileWriter("zadacha");
        fileWriter.write("A a\n" +
                "B b\n" +
                "C c\n" +
                "D d\n" +
                "E e\n" +
                "F f\n" +
                "G g\n" +
                "H h\n" +
                "I i\n" +
                "J j\n" +
                "K k\n" +
                "L l\n" +
                "M m\n" +
                "N n\n" +
                "O o\n" +
                "P p\n" +
                "Q q\n" +
                "R r\n" +
                "S s\n" +
                "T t\n" +
                "U u\n" +
                "V v\n" +
                "W w\n" +
                "X x\n" +
                "Y y\n" +
                "Z z\n1\n2\n3\n4\n5\n6\n7\n8\n9");
        fileWriter.close();
        FileReader reader =new FileReader("zadacha");
        Scanner scanner=new Scanner(reader);

        int count=0;
        while (scanner.hasNextLine()){
            count++;
            System.out.println(count+" " +scanner.nextLine());

        }




    }
}