import java.util.ArrayList;
import java.util.Scanner;

public class J05069caulacbobongda {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <doibong> a= new ArrayList<>();
        while(t--> 0)
        {
           a.add(new doibong(sc.nextLine(), sc.nextLine(), sc.nextInt()));
           if(t> 0) sc.nextLine(); 
        }

        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String ss= sc.next(); 
            long aa= sc.nextLong();
            if(n> 0) sc.nextLine();
            for(doibong i: a)
            {
                if(i.ma.compareTo(ss.substring(1, 3))== 0)
                {
                    i.lam(ss, aa);
                    System.out.println(i.ma+ " "+ i.ten+ " "+ i.tien);
                }
            }
        }
    }
}

class doibong
{
    String ma;
    String ten;
    int sl;
    long tien;

    doibong(String ma, String ten, int sl)
    {
        this.ma= ma;
        this.ten= ten;
        this.sl= sl;
    }

    public void lam(String ma, long tien)
    {
        this.ma= ma;
        this.tien= tien* this.sl;
    }

    // public String toString()
    // {
    //     return ma+ " "+ ten+ " "+ tien;
    // }
}
// 2
// AC
// AC Milan
// 12
// MU
// Manchester United
// 10
// 2
// IAC1 80000
// EMU2 60000