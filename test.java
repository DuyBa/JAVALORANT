import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * test
 */
public class test {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOV.in"));
        int n= sc.nextInt();
        sc.nextLine();
        mh[] a= new mh[n];
        for(int i= 0; i< n; i++)
        {
            mh k= new mh();
            k.input();
            a[i]= k;
        }
        Arrays.sort(a, new tmp());
        for(int i= 0; i< n; i++) a[i].out();

        sc.close();
    }
}

class tmp implements Comparator<mh>
{
    public int compare(mh sau, mh truoc)
    {
        if((sau.ma).compareTo(truoc.ma)== -1) return 1;
        return -1;
    }
}
class mh
{
    String ma;
    String ten;
    String hinhthuc;
    Scanner sc= new Scanner(System.in);

    void input()
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