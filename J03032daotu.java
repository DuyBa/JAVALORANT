import java.util.Scanner;

public class J03032daotu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            s.trim();
            while(s.contains("  "))
            {
                s= s.replace("  ", " ");
            }
            String[] a= s.split(" ");
            for(int i= 0; i< a.length; i++)
            {
                StringBuilder ss= new StringBuilder();
                ss.append(a[i]);
                System.out.print(ss.reverse()+ " ");
            }
            System.out.println("");
        }
    }
}
