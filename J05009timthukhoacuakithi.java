import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05009timthukhoacuakithi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tk> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tk(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<tk>() {
            public int compare(tk truoc, tk sau)
            {
                if(sau.diemtong> truoc.diemtong) return 1;
                if(sau.diemtong== truoc.diemtong) if(truoc.ma> sau.ma) return 1;
                return -1;
            }
        });

        for(tk i: a)
            if(i.diemtong== a.get(0).diemtong) 
                System.out.println(i);
        
    }
}

class tk
{
    int ma;
    String ten;
    String ngay;
    double diem1;
    double diem2;
    double diem3;
    double diemtong;

    tk(int i, String ten, String ngay, double diem1, double diem2, double diem3)
    {
        this.ma= i;
        this.ten= ten;
        this.ngay= ngay;
        this.diem1= diem1;
        this.diem2= diem2;
        this.diem3= diem3;
        this.diemtong= this.diem1+ this.diem2+ this.diem3;
    }

    public String toString()
    {
        String tmp= "";
        tmp+= String.valueOf(ma)+ " "+ ten+ " "+ ngay+ " "+ String.valueOf(diemtong);
        return tmp;
    }

}