import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * J05007sapxepdanhsachnhanvien
 */
public class J05007sapxepdanhsachnhanvien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <DSNV> a= new ArrayList<DSNV>();
        for(int i= 1; i<= t; i++)
        {
        	a.add(new DSNV(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        	// if(i<t) sc.nextLine();
        }

        Collections.sort(a, new Comparator<DSNV>() {
            public int compare(DSNV truoc, DSNV sau)
            {
                if(truoc.yy!= sau.yy) return truoc.yy- sau.yy;
                if(truoc.mm!= sau.mm) return truoc.mm- sau.mm;
                if(truoc.dd!= sau.dd) return truoc.dd- sau.dd;
                return -1;
            }
        });
                
        for(DSNV i: a) 
            System.out.println(i);
    }
}

class DSNV
{
    String ma= "";
    String ten="";
    String gt;
    String ngay= "";
    Integer dd, mm, yy;
    String dc;
    String so;
    String ngay1;

    DSNV(int i, String ten, String gt, String ngay, String dc, String so, String ngay1)
    {
        if(i< 10) ma+= "0000";
        else if(i< 100) ma+= "000";
        else if(i< 1000) ma+= "00";
        else if(i< 10000) ma+= "0";
        ma+= String.valueOf(i);
        
        this.ten= ten;
        this.gt= gt;

        this.ngay= ngay;
        String[] tmp= ngay.split("/");
        dd= Integer.parseInt(tmp[0]);
        mm= Integer.parseInt(tmp[1]);
        yy= Integer.parseInt(tmp[2]);
        

        this.dc= dc;
        this.so= so;
        this.ngay1= ngay1;

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ gt+ " "+ ngay+ " "+ dc+ " "+ so+ " "+ ngay1;
    }
}
