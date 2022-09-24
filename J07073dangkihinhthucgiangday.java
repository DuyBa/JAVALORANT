import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07073dangkihinhthucgiangday
 */
public class J07073dangkihinhthucgiangday {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOC.in"));
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <monhoccc> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add(new monhoccc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<monhoccc>() {
            public int compare(monhoccc truoc, monhoccc sau)
            {
                if(truoc.ma.compareTo(sau.ma)!= 0) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        for(monhoccc i: a)
        {
            if(i.th.contains("Truc tuyen")|| i.th.contains(".ptit.edu.vn"))
                System.out.println(i);
        }
    }
}

class monhoccc
{
    String ma;
    String ten;
    int tin;
    String lt, th;

    monhoccc(String ma, String ten, String tin, String lt, String th)
    {
        this.ma= ma;
        this.ten= ten;
        this.tin= Integer.parseInt(tin);
        this.lt= lt;
        this.th= th;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ tin+ " "+ lt+ " "+ th;
    }
}