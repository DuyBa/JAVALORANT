import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class locemailtrungnhau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set <String> aa= new HashSet<>();
        ArrayList <String> a;
        while(sc.hasNextLine())
            aa.add(sc.nextLine().toLowerCase());
        a= new ArrayList<>(aa);
        Collections.sort(a);
        for(String i: a)
            System.out.println(i);
    }
}
