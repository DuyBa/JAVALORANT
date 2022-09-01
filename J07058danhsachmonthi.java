
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class J07058danhsachmonthi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOC.in"));
        int n= sc.nextInt();
        sc.nextLine();
        Vector<mh> a= new Vector<>();
        for(int i= 0; i< n; i++)
        {
            mh k= new mh();
            k.input(sc);
            a.add(k);
        }
        Collections.sort(a, new Comparator<mh>() {
            public int compare(mh sau, mh truoc)
            {
                if(sau.ma.compareTo(truoc.ma)> 0) return 1;
                return -1;
            }
        });
        for(int i= 0; i< n; i++) a.get(i).out();
        
        sc.close();
    }

}

class mh
{
    String ma;
    String ten;
    String hinhthuc;

    void input(Scanner sc)
    {
        ma= sc.nextLine();
        ten= sc.nextLine();
        hinhthuc= sc.nextLine();
    }

    void out()
    {
        System.out.println(ma+ " "+ ten+ " "+ hinhthuc);
    }
}