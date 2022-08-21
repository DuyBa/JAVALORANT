import java.util.Scanner;

public class J01010catdoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while( t--> 0)
        {
            String a= sc.next();
            System.out.println(ck(a));
        }  
    }

    public static String ck(String a) {
        String b= "";
        char[] c= a.toCharArray();
        for(int i=0; i< a.length(); i++)
        {
            if( c[i]!= '0'&& c[i]!= '1'&& c[i]!= '8'&& c[i]!= '9') return "INVALID";
            else
            {
                if( c[i]== '0') b+= '0';
                if( c[i]== '1') b+= '1';
                if( c[i]== '8') b+= '0';
                if( c[i]== '9') b+= '0';
            }
        }
        if( Long.parseLong(b)== 0) return "INVALID";
        else return String.valueOf(Long.parseLong(b));
    }
}
