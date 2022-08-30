import java.util.Scanner;

class hcn{
    double dai;
    double rong;
    String cl;
    
    void input(Scanner sc)
    {
        this.dai= sc.nextDouble();
        this.rong= sc.nextDouble();
        this.cl= sc.next();
        sc.nextLine();
    }

    double chuvi(){
        return (this.dai+ this.rong)* 2;
    }

    double dientich()
    {
        return this.dai* this.rong;
    }

    String in(){
        return this.cl;
    }
}
public class J04002khaibaohinhchunhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        hcn a= new hcn();
        a.input(sc);
        String s= a.cl;
        if((int) a.dai< 0|| (int) a.rong< 0) System.out.println("INVALID");
        else
        {
            s= s.substring(0, 1).toUpperCase()+ s.substring(1).toLowerCase();
            System.out.print((int)a.chuvi()+ " ");
            System.out.print((int)a.dientich()+ " ");
            System.out.println(s);
        }       
    }
}
