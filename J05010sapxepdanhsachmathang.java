import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05010sapxepdanhsachmathang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <mhh> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new mhh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();    
        }

        Collections.sort(a, new Comparator<mhh>() {
            public int compare(mhh truoc, mhh sau)
            {
                if(sau.lai> truoc.lai) return 1;
                return -1;
            }
        });
        
        for(mhh i: a) 
            System.out.println(i);
    }
}

class mhh
{
    int stt;
    String ten;
    String loai;
    double mua;
    double ban;
    double lai;

    mhh(int i, String ten, String loai, double mua, double ban)
    {
        stt= i;
        this.ten= ten;
        this.loai= loai;
        this.mua= mua;
        this.ban= ban;
        this.lai= this.ban- this.mua;
    }

    public String toString()
    {
        String tmp= "";
        tmp+= String.valueOf(stt)+ " "+ ten+ " "+ loai+ " "+ String.format("%.2f", lai);
        return tmp;
    }
}