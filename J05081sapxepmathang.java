import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * J05081sapxepmathang
 */
public class J05081sapxepmathang {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList <mmhh> a= new ArrayList<>();
        for(int i= 1; i<= n; i++)
        {
            a.add(new mmhh(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            if(i< n) sc.nextLine();
        }
            
        
            Collections.sort(a, new Comparator<mmhh>() {
                public int compare(mmhh truoc, mmhh sau)
                {
                    if(truoc.lai!= sau.lai) return sau.lai- truoc.lai;
                    if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                    return -1;
                }
            });

        for(mmhh i: a) System.out.println(i);
    }
}

class mmhh
{
    String ma= "MH";
    String ten;
    String loai;
    int giamua;
    int giaban;
    int lai;

    mmhh(int i, String a, String b, int aa, int bb)
    {
        if(i< 10) ma+= "00";
        else if(i<100) ma+= "0";
        ma+= String.valueOf(i);

        ten= a;
        loai= b;
        giamua= aa;
        giaban= bb;
        lai= giaban- giamua;
    }

    public String toString()
    {
        String tmp= new String();
        tmp+= ma+ " "+ ten+ " "+ loai+ " "+ giamua+ " "+ giaban+ " "+ lai;
        return tmp;
    }
}