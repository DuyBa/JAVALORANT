import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022loaibosonguyen {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DATA.in");
        Scanner sc= new Scanner(file);
        ArrayList <String> a= new ArrayList<>();
        while(sc.hasNext())
        {
            String tmp= sc.next();
            try{
                Integer.parseInt(tmp);
            }
            catch (NumberFormatException x){
                a.add(tmp);
            }
        }
        Collections.sort(a);
        for(String i: a)
            System.out.print(i+ " ");
    }
}
