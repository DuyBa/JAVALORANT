import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i= 1; i<= t; i++)
        {
            ArrayList <Integer> a= new ArrayList<>();
            ArrayList <Integer> aa= new ArrayList<>();
            int n= sc.nextInt();
            while(n--> 0) 
            {
                int nhap= sc.nextInt();
                a.add(nhap);
                if(Collections.frequency(aa, nhap)== 0) aa.add(nhap);
            }
            
            
            System.out.printf("Test %d:\n", i);
            for(Integer j: aa)
                System.out.printf("%d xuat hien %d lan\n", j, Collections.frequency(a, j));
        }
    }
}
