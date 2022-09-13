import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J05080lophocphan2
 */
public class J05080lophocphan2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <lhp2> a= new ArrayList<>();
        while(t--> 0)
            a.add(new lhp2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(a, new Comparator<lhp2>() {
            public int compare(lhp2 truoc, lhp2 sau)
            {
                if(truoc.ma.compareTo(sau.ma)!= 0) return truoc.ma.compareTo(sau.ma);
                return truoc.stt.compareTo(sau.stt);
            }
        });
        
        t= sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String tmp= sc.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n", tmp);
            for(lhp2 i: a)
                if(tmp.compareTo(i.ten)== 0)
                    System.out.println(i);
        }
    }
}

class lhp2
{
    String ma;
    String mon;
    String stt;
    String ten;

    lhp2(String ma, String mon, String stt, String ten)
    {
        this.ma= ma;
        this.mon= mon;
        this.stt= stt;
        this.ten= ten;
    }

    public String toString()
    {
        return ma+ " "+ mon+ " "+ stt;
    }
}
