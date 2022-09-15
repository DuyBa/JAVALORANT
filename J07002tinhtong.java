import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002tinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DATA.in");
        Scanner sc= new Scanner(file);
        long tong= 0;
        while(sc.hasNext())
        {
            try{
                tong+= Integer.parseInt(sc.next());
            }
            catch(NumberFormatException a){
            }
        }
        System.out.println(tong);
    }
}
