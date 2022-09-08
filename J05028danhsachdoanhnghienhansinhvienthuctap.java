import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


/**
 * J05028danhsachdoanhnghienhansinhvienthuctap
 */
public class J05028danhsachdoanhnghienhansinhvienthuctap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <svtt> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new svtt(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            if(i< t) sc.nextLine();
        }
            

        Collections.sort(a, new Comparator<svtt>() {
            public int compare(svtt truoc, svtt sau)
            {
                if(truoc.so< sau.so) return 1;
                if(truoc.so== sau.so) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
                
            }
        });

        for(svtt i: a)
            System.out.println(i);

    }
}

class svtt
{
    String ma;
    String ten;
    int so;

    svtt(String ma, String ten, int so)
    {
        this.ma= ma;
        this.ten= ten;
        this.so= so;
    }

    public String toString()
    {
        String a= "";
        a+= ma+ " "+ ten+ " "+ so;
        return a;
    }
}