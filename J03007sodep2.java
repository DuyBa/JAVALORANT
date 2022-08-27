import java.util.Scanner;

public class J03007sodep2 {
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
        if(a[0]!= '8'&& a[a.length- 1]!= '8') return 0;
        long tong= 0;
        for(int i= 0; i< a.length; i++)
            tong+= Character.getNumericValue(a[i]);
        if(tong% 10!= 0) return 0;
        return 1;
    }
}
