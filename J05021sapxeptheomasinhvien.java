import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * J05021sapxeptheomasinhvien
 */
public class J05021sapxeptheomasinhvien {
    public static void main(String[] args) throws NoSuchElementException{
        Scanner sc= new Scanner(System.in);
        ArrayList <dssvtl> a= new ArrayList<>();
        while(sc.hasNext())
            a.add(new dssvtl(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(a, new Comparator<dssvtl>() {
            public int compare(dssvtl truoc, dssvtl sau)
            {
                if(sau.ma.compareTo(truoc.ma)< 0) return 1;
                return -1;  
            }
        });


        for(dssvtl i: a)
            System.out.println(i);
        
    }
}

class dssvtl
{
    String ma;
    String ten;
    String lopp;
    String email;

    dssvtl(String ma, String ten, String lopp, String email)
    {
        this.ma= ma;
        this.ten= ten;
        this.lopp= lopp;
        this.email= email;
    }

    public String toString()
    {
        String a= "";
        a+= ma+ " "+ ten+ " "+ lopp+ " "+ email;
        return a;
    }
}