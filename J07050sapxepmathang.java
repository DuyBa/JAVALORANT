import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07050sapxepmathang
 */
public class J07050sapxepmathang {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MATHANG.in"));
        int t= Integer.parseInt(sc.nextLine());
        ArrayList <mathang> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new mathang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }
            
    
        
        
        Collections.sort(a, new Comparator<mathang>() {
            public int compare(mathang truoc, mathang sau)
            {
                if(truoc.lai< sau.lai) return 1;
                return -1;
            }
        });

        for(mathang i: a)
            System.out.println(i);
        
    }
}

class mathang
{
    String ma, ten, nhom;
    double mua, ban, lai;

    mathang(int i, String ten, String nhom, double mua, double ban)
    {
        this.ma= String.format("MH%02d", i);
        this.ten= ten;
        this.nhom= nhom;
        this.ban= ban;
        this.mua= mua;
        this.lai= this.ban- this.mua;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ nhom+ " "+ String.format("%.2f", lai);
    }
}