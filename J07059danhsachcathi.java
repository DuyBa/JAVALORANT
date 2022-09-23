import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07059danhsachcathii
 */
public class J07059danhsachcathi {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("CATHI.in"));
        ArrayList <cathii> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i= 1;i<= t; i++)
        {
            
            a.add(new cathii(i, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(a, new Comparator<cathii>() {
            public int compare(cathii truoc, cathii sau)
            {

                if(truoc.ngay.compareTo(sau.ngay)> 0) return 1;
                if(truoc.ngay.compareTo(sau.ngay)== 0&& truoc.gio.compareTo(sau.gio)> 0) return 1;
                if(truoc.ngay.compareTo(sau.ngay)== 0&& truoc.gio.compareTo(sau.gio)== 0) return truoc.ma.compareTo(sau.ma);
                return -1; 
                
            }
        });

        for(cathii i: a)
            System.out.println(i);
    }
}

class cathii
{
    String ma;
    String ngay;
    String gio ;
    int hh, mm;
    String id;

    cathii(int i, String ngay, String gio, String id)
    {
        this.ma= String.format("C%03d", i);
        String[] tmp= gio.split(":");
        hh= Integer.parseInt(tmp[0]); mm= Integer.parseInt(tmp[1]);
        this.id= id;
        this.gio= gio;
        this.ngay= ngay;
    }

    public String toString()
    {
        return ma+ " "+ ngay+ " "+ gio+ " "+ id;
    }
}