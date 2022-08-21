import java.util.Scanner;

public class J01016chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        int dem= 0;
        for(int i= 0; i< a.length(); i++)
        {
            if(a.charAt(i)== '4'|| a.charAt(i)== '7') dem++;
        }
        if( dem== 4|| dem== 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
