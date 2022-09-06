import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05011tinhgio {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList <gt> a= new ArrayList<>();
        for(int i= 1; i<= n; i++)
            a.add(new gt(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(a, new Comparator<gt>() {
            public int compare(gt truoc, gt sau)
            {
                if(truoc.gio!= sau.gio) return sau.gio- truoc.gio;
                if(truoc.phut!= sau.phut) return sau.phut- truoc.phut;
                return -1;
            }
        });
        
        for(gt i: a)
            System.out.println(i);
    }
}

class gt
{
    String ma;
    String ten;
    String den;
    String di;
    int gio;
    int phut;

    gt(String ma, String ten, String den, String di)
    {
        this.ma= ma;
        this.ten= ten;
        this.den= den;
        this.di= di;
        Integer gden= Integer.parseInt(den.substring(0, 2));
        Integer pden= Integer.parseInt(den.substring(3));
        Integer gdi= Integer.parseInt(di.substring(0, 2));
        Integer pdi= Integer.parseInt(di.substring(3));

        Integer tmp= 0;
        if(pdi< pden)
        {
            gdi--;
            pdi+= 60;
        }
        this.phut= pdi- pden;
        this.gio= gdi- gden- tmp;
    }

    public String toString()
    {
        String tmp= "";
        tmp+= ma+ " "+ ten+ " "+ String.valueOf(gio)+ " gio "+ String.valueOf(phut)+ " phut";
        return tmp;
    }
}