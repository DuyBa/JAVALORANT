import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * J03009tapturiengcuahaixau
 */
public class J03009tapturiengcuahaixau {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            String ss= sc.nextLine();
            String[] a= s.split(" ");
            String[] b= ss.split(" ");
            Set <String> sa= new HashSet<>(), sb= new HashSet<>();
            Collections.addAll(sa, a);
            Collections.addAll(sb, b);
            for(String i: sa)
            {
                if(sb.contains(i)== false)
                    System.out.print(i+ " ");
            }
            System.out.println("");
        }
    }
}