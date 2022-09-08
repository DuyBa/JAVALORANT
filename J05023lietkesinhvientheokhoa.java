import java.util.ArrayList;
import java.util.Scanner;

/**
 * J05022lietkesinhvientheolop
 */
/**
 * J05023lietkesinhvientheokhoa
 */
public class J05023lietkesinhvientheokhoa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dssvtl> a= new ArrayList<>();
        while(t-- > 0)
            a.add(new dssvtl(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String k= sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", k);
            for(dssvtl i: a) 
                if(i.lopp.substring(1, 3).compareTo(k.substring(2, 4))== 0) 
                    System.out.println(i);
        }
        
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