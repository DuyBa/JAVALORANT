import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07081sapxepdanhsachsinhvien {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <sinhvienn> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add(new sinhvienn(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<sinhvienn>() {
            public int compare(sinhvienn truoc, sinhvienn sau)
            {
                if(truoc.tenn.compareTo(sau.tenn)!= 0) return truoc.tenn.compareTo(sau.tenn);
                else if(truoc.ma.compareTo(sau.ma)!= 0) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        for(sinhvienn i: a)
            System.out.println(i);
    }
}

class sinhvienn
{
    String ma;
    String ten;
    String sdt;
    String mail;
    String tenn;

    sinhvienn(String ma, String ten, String sdt, String mail)
    {
        this.ma= ma;
        this.ten= ten;
        this.sdt= sdt;
        this.mail= mail;
        String[] tmp= ten.split(" ");
        this.tenn= tmp[tmp.length- 1];
        for(int i= 0; i< tmp.length- 1; i++)
            tenn+= " "+ tmp[i];
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ sdt+ " "+ mail;
    }
}