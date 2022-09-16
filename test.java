import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * J07010danhsachsinhvientrongfile2
 */
/**
 * test
 */
public class test {

    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("SV.in");
        Scanner sc= new Scanner(file);
        while(sc.hasNext())
        System.out.println(sc.nextLine());
        
    }
}