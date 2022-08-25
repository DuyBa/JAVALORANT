import java.util.Scanner;

public class J01024sotamphan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            String a= sc.next();
            System.out.println(ck(a));
        }
    }

    public static String ck(String a) {
        char[] c= a.toCharArray();
        for(int i=0; i< a.length(); i++)
        {
            if(c[i]!= '0'&& c[i]!= '1'&& c[i]!= '2') return "NO";
        }
        return "YES";
    }
}
