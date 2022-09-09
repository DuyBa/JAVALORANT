
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class J05035danhsachthuctap2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList<dstp1> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
            a.add(new dstp1(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    
        Collections.sort(a, new Comparator<dstp1>() {
            public int compare(dstp1 truoc, dstp1 sau)
            {
                if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String tmp= sc.nextLine();
            for(dstp1 i: a)
                if(i.lam.compareTo(tmp)== 0)
                    System.out.println(i);
        }
    }
}

class dstp1
{
    String stt;
    String ma;
    String ten;
    String lop;
    String email;
    String lam;

    dstp1(int i, String ma, String ten, String lop, String email, String lam)
    {
        this.stt= String.valueOf(i);
        this.ma= ma.trim();
        this.ten= ten.trim();
        this.lop= lop.trim();
        this.email= email.trim();
        this.lam= lam.trim();
    }

    public String toString()
    {
        return stt+ " "+ ma+ " "+ ten+ " "+ lop+ " "+ email+ " "+ lam;
    }
}