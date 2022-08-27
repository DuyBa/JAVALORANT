import java.util.Scanner;

public class J03008sodep3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            String s= sc.nextLine();
            if(ck(s)== 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static int ck(String s) {
        int c= 0, d= s.length()- 1;
        char[] a= s.toCharArray();
        while(c< d)
        {
            if(a[c]!= a[d]) return 0;
            c++;
            d--;
        }
        for(int i= 0; i< a.length; i++)
            if(a[i]!= '2'&& a[i]!= '3'&& a[i]!= '5'&& a[i]!= '7')
                return 0;
        return 1;
    }
}
