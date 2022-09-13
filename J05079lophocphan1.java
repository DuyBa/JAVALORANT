import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05079lophocphan1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <lhp1> a= new ArrayList<>();
        while(t--> 0)
            a.add(new lhp1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(a, new Comparator<lhp1>() {
            public int compare(lhp1 truoc, lhp1 sau)
            {
                return truoc.stt.compareTo(sau.stt);
            }
        });
        
        t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String tmp= sc.nextLine();
            for(lhp1 i: a)
            {
                if(tmp.compareTo(i.ma)== 0)
                {
                    System.out.printf("Danh sach nhom lop mon %s:\n", i.mon);
                    break;
                }
            }
            for(lhp1 i: a)
                if(tmp.compareTo(i.ma)== 0)
                    System.out.println(i);
        }
    }
}

class lhp1
{
    String ma;
    String mon;
    String stt;
    String ten;

    lhp1(String ma, String mon, String stt, String ten)
    {
        this.ma= ma;
        this.mon= mon;
        this.stt= stt;
        this.ten= ten;
    }

    public String toString()
    {
        return stt+ " "+ ten;
    }
}
