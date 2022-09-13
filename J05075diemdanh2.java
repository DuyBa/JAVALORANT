import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * J05075diemdanh2
 */
public class J05075diemdanh2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        int n= t;
        ArrayList <diemdanh> a= new ArrayList<>();
        while(t--> 0)
            a.add(new diemdanh(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Map <String, Integer> aa= new HashMap<String,Integer>();
        while(n--> 0)
        {
            String ma= sc.next();
            String dd=  sc.next();
            sc.nextLine();
            Integer tong= 10;
            for(int i= 0; i< dd.length(); i++)
                if(dd.charAt(i)== 'v') tong-= 2;
                else if(dd.charAt(i)== 'm') tong-= 1;
            if(tong< 0) tong= 0;
            aa.put(ma, tong);
        }

        String lopp= sc.nextLine();

        for(diemdanh i: a)
        {
            if(i.lop.compareTo(lopp)== 0)
            {
                System.out.print(i);
                System.out.print(" "+ aa.get(i.ma));
                if(aa.get(i.ma)== 0) System.out.print(" KDDK");
                System.out.println("");
            }

        }
    }
}

class diemdanh
{
    String ma;
    String ten;
    String lop;
    int diem;
    String ghichu;

    diemdanh(String ma, String ten, String lop)
    {
        this.ma= ma;
        this.ten= ten;
        this.lop= lop;
    }




    public String toString()
    {
        return ma+ " "+ ten+ " "+ lop;
    }
}

// 3
// B19DCCN999
// Le Cong Minh
// D19CQAT02-B
// B19DCCN998
// Tran Truong Giang
// D19CQAT02-B
// B19DCCN997
// Nguyen Tuan Anh
// D19CQCN04-B
// B19DCCN998 xxxmxmmvmx
// B19DCCN997 xmxmxxxvxx
// B19DCCN999 xvxmxmmvvm