import java.util.Scanner;

public class J01026sochinhphuong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            long a= sc.nextLong();
            double h= Math.floor(Math.sqrt((double)a));
            if((int) h* (int) h== a ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
