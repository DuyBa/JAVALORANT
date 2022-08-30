import java.util.Scanner;

public class J03040biensodep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            String[] a= s.split("-");
            String c= a[1].replace(".", "");
            System.out.println(ck(c)); 
        }
    }

    public static String ck(String s) {
        char[] a= s.toCharArray();

        if(a[0]< a[1] && a[1]< a[2]&& a[2]< a[3]&& a[3]< a[4]) return "YES";

        if(a[1]== a[0]&& a[2]== a[0]&& a[3]== a[0]&& a[4]== a[0]) return "YES";

        if(a[0]== a[1]&& a[2]== a[0]&& a[3]== a[4]) return "YES";

        if((a[0]== '6' || a[0]== '8')&& (a[1]== '6' || a[1]== '8')&& (a[2]== '6' || a[2]== '8')&& (a[3]== '6' || a[3]== '8')&& (a[4]== '6' || a[4]== '8')) return "YES";

        return "NO";

        
    }
}
