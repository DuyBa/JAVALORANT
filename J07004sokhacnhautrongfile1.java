import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class J07004sokhacnhautrongfile1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DATA.in");
        Scanner sc= new Scanner(file);
        ArrayList <Integer> a= new ArrayList<>();
        Set <Integer> aa= new HashSet<>();
        while(sc.hasNext())
        {
            Integer res= Integer.parseInt(sc.next());
            a.add(res);
            aa.add(res);
        }
        List <Integer> sortt= new ArrayList<>(aa);
        Collections.sort(sortt);
        for(Integer i: sortt)
        {
            System.out.printf("%d %d\n", i, Collections.frequency(a, i));
        }  
    }
}
