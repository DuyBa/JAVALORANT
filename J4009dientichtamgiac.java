import java.util.Scanner;

public class J4009dientichtamgiac {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            pt a= new pt(),  b= new pt(), c= new pt();
            a.input(sc);
            b.input(sc);
            c.input(sc);
            inn1(a, b, c);
        }
    }

    public static void inn1(pt a, pt b, pt c) 
    {
        double canh1= a.tinh(b);
        double canh2= a.tinh(c);
        double canh3= b.tinh(c);
        if(ck(canh1, canh2, canh3)== 0) System.out.println("INVALID");
        else System.out.printf("%.2f\n", (Math.sqrt((canh1+ canh2 + canh3)*(canh1+ canh2- canh3)*(-canh1+ canh2 + canh3)*(canh1- canh2 + canh3)))/ 4);
    }

    public static int ck(double a, double b, double c)
    {
        if(a+ b<= c || a+ c<= b|| b+ c<= a) return 0;
        return 1;
    }
}

class pt{
    double x;
    double y;

    void input(Scanner sc)
    {
        x= sc.nextDouble();
        y= sc.nextDouble();
    }

    double tinh(pt a)
    {
        double t= Math.abs(x- a.x);
        double h= Math.abs(y- a.y);
        return Math.sqrt(t* t+ h* h);
    }


}