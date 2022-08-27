import java.util.Scanner;

/**
 * J03004chuanhoaxauhoten
 */
public class J03004chuanhoaxauhoten {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String ss;
            ss= sc.nextLine();
            String s= ss.trim();
            while(s.contains("  ")== true)
                s= s.replace("  ", " ");
            s= s.toLowerCase();
            char[] a= s.toCharArray();
            a[0]= Character.toUpperCase(a[0]);
            for(int i= 1; i< a.length; i++)
            {
                if(a[i-1]== ' ')
                    a[i]= Character.toUpperCase(a[i]);
            }
            String neww= new String(a);
            System.out.println(neww);
            
        }
    }
}