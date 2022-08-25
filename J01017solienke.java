import java.util.Scanner;

public class J01017solienke {
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
        char[] c= a.toCharArray();
        for(int i=1; i< a.length(); i++)
        {
            if(Math.abs((int)c[i]- (int)c[i- 1])!= 1) return "NO";
        }
        return "YES";
    }
}
