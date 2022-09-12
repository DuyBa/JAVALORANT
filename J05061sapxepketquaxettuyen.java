import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * J05060ketquaxettuyen
 */
/**
 * J05061sapxepketquaxettuyen
 */
public class J05061sapxepketquaxettuyen {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <kqxt> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new kqxt(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<kqxt>() {
            public int compare(kqxt truoc, kqxt sau)
            {
                if(truoc.diem< sau.diem) return 1;
                if(truoc.diem== sau.diem) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
            }
        });

        for(kqxt i: a)
            System.out.println(i);
    }
}

class kqxt
{
    String ma= "PH";
    String ten;
    int tuoi;
    int diem;
    String xl;

    kqxt(int i, String ten, String ngay, double lt, double th)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);

        this.ten= ten;

        tuoi= 2021- Integer.parseInt(ngay.substring(6));

        double thuong= 0;
        if(lt>= 8&& th>= 8) thuong+= 1;
        else if(lt>= 7.5&& th>= 7.5) thuong+= 0.5;

        diem= (int) Math.round((lt+ th)/ 2+ thuong);
        if(diem> 10) diem= 10;

        if(diem< 5) xl= "Truot";
        if(diem>= 5&& diem<= 6) xl= "Trung binh";
        if(diem== 7) xl= "Kha";
        if(diem== 8) xl= "Gioi";
        if(diem== 9|| diem== 10) xl= "Xuat sac";


    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ tuoi+ " "+ diem+ " "+ xl;
    }
}