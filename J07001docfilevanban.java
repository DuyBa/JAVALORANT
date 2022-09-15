import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001docfilevanban {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DATA.in");
        Scanner sc= new Scanner(file);
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }
    }
}
