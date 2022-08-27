import java.util.Scanner;

public class J03005chuanhoaxauhoten2 {
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
            String[] a= s.split(" ");
            for(int i= 1; i< a.length; i++ )
            {
                String b= "";
                b+= a[i].substring(0, 1).toUpperCase()+ a[i].substring(1);
                System.out.print(b);
                if(i!= a.length- 1) System.out.print(" ");
                else System.out.print(", ");
            }
            String b= "";
            b+= a[0].substring(0).toUpperCase();
            System.out.print(b);
            System.out.println("");
        }
    }
}
