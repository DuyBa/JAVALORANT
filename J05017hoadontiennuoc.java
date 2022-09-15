import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05017hoadontiennuoc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <hdtn> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new hdtn(i, sc.nextLine(), sc.nextInt(), sc.nextInt()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<hdtn>() {
            public int compare(hdtn truoc, hdtn sau)
            {
                if(truoc.tong< sau.tong) return 1;
                return -1;
            }
        });

        for(hdtn i: a)
            System.out.println(i);
    }
}

class hdtn
{
    String ma;
    String ten;
    int cu, moi;
    long tong;

    hdtn(int i, String ten, int cu, int moi)
    {
        this.ma= String.format("KH%02d", i);
        this.ten= ten;
        int dung= moi- cu;
        if(dung<= 50) tong= Math.round(100* dung* 1.02);
        else if(dung<= 100) tong= Math.round((100* 50+ (dung- 50)* 150)* 1.03);
        else tong= Math.round((100* 50+ 150* 50+ (dung- 100)* 200)* 1.05);
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ tong;
    }
}