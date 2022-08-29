import java.util.Scanner;

public class J03021dienthoaicucgach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        String[] a= new String[10];
        a[0]= "";
        a[1]= "";
        a[2]= "ABC";
        a[3]= "DEF";
        a[4]= "GHI";
        a[5]= "JKL";
        a[6]= "MNO";
        a[7]= "PQRS";
        a[8]= "TUV";
        a[9]= "WXYZ";
        while(t--> 0)
        {
            String s= sc.nextLine();
            s= s.toUpperCase();
            String tmp= "";
            for(int i= 0; i< s.length(); i++)
            {
                for(int j= 2; j<= 9; j++)
                {
                    String h= ""+ s.charAt(i);
                    if(a[j].contains(h))
                    {
                        tmp+= String.valueOf(j);
                        break;
                    }
                }
            }
            System.out.println(ck(tmp));
        }
    }

    public static String ck(String a) {
        int c= 0, d= a.length()- 1;
        while(c< d)
        {
            if(a.charAt(c)!= a.charAt(d)) return "NO";
            c++;
            d--;
        }
        return "YES";
    }
}
