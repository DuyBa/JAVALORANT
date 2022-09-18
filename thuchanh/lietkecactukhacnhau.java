

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class lietkecactukhacnhau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        List <String> nhom1= new ArrayList<>();
        Set <String> nhom11= new HashSet<>();
        List <String> nhom2= new ArrayList<>();
        Set <String> nhom22= new HashSet<>();
        int n= sc.nextInt();
        sc.nextLine();
        for(int i= 0; i< n; i++)
        {
            String[] tmp= sc.nextLine().split(" ");
            for(String j: tmp) nhom11.add(j.toLowerCase()); 
        }

        int m= sc.nextInt();
        sc.nextLine();
        for(int i= 0; i< m; i++)
        {
            String[] tmp= sc.nextLine().split(" ");
            for(String j: tmp) nhom22.add(j.toLowerCase()); 
        }

        for(String i: nhom11)
            if(Collections.frequency(nhom22, i)== 0)
                nhom1.add(i);
        Collections.sort(nhom1);
        for(String i: nhom1)
            System.out.print(i+ " ");
        System.out.println("");

        for(String i: nhom22)
        if(Collections.frequency(nhom11, i)== 0)
            nhom2.add(i);
            Collections.sort(nhom2);
        for(String i: nhom2)
            System.out.print(i+ " ");

    }
}
