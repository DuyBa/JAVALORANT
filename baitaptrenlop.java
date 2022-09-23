import java.util.Scanner;

class hcn{
    private int dai;
    private int rong;
    
    void input(Scanner sc)
    {
        this.dai= sc.nextInt();
        this.rong= sc.nextInt();
        sc.nextLine();
    }

    int getdai()
    {
        return dai;
    }

    int getrong()
    {
        return rong;
    }

    int chuvi(){
        return (this.dai+ this.rong)* 2;
    }

    int dientich()
    {
        return this.dai* this.rong;
    }
}
/**
 * baitaptrenlop
 */
public class baitaptrenlop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        hcn a= new hcn();
        a.input(sc);
        if((int) a.getdai()< 0|| (int) a.getrong()< 0) System.out.println("INVALID");
        else
        {
            System.out.print(a.chuvi()+ " ");
            System.out.print(a.dientich()+ " ");
        }       
    }
}
