import java.util.ArrayList;
import java.util.Scanner;

/**
 * J05022lietkesinhvientheolop
 */
/**
 * J05023lietkesinhvientheokhoa
 */
/**
 * J05024lietkesinhvientheonganh
 */
public class J05024lietkesinhvientheonganh {
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
            k= k.toUpperCase();
            String tmp= new String();
            if(k.compareTo("KE TOAN")== 0) tmp= "DCKT";
            if(k.compareTo("CONG NGHE THONG TIN")== 0) tmp= "DCCN";
            if(k.compareTo("AN TOAN THONG TIN")== 0) tmp= "DCAT";
            if(k.compareTo("VIEN THONG")== 0) tmp= "DCVT";
            if(k.compareTo("DIEN TU")== 0) tmp= "DCDT";
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", k);
            
            for(dssvtl i: a) 
                if(i.ma.substring(3, 7).compareTo(tmp)== 0)
                {
                    if(tmp.compareTo("DCCN")!= 0&& tmp.compareTo("DCAT")!= 0 ) 
                        System.out.println(i);
                    else if(i.lopp.charAt(0)!= 'E') System.out.println(i);
                }

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