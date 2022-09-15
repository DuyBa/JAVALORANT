
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class J05016hoadonkhachsan {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <hdks> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new hdks(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            
        }

        Collections.sort(a, new Comparator<hdks>() {
            public int compare(hdks truoc, hdks sau)
            {
                if(truoc.tong< sau.tong) return 1;
                return -1;
            }
        });

        for(hdks i: a)
            System.out.println(i);
    }
}

class hdks
{
    String ma;
    String ten;
    int sophong;
    String ngaynhan;
    String ngaytra;
    long songay, tong;
    int tienphatsinh;

    hdks(int i, String ten, String sophong, String ngaynhan, String ngaytra, String tien) throws ParseException
    {

        ten= ten.trim();
        sophong= sophong.trim();
        ngaynhan= ngaynhan.trim();
        ngaytra= ngaytra.trim();
        tien= tien.trim();

        this.ma= String.format("KH%02d", i);
        this.ten= ten;

        int gia= 0, dau= 0;
        this.sophong= Integer.parseInt(sophong);
        dau= Integer.parseInt(sophong.substring(0, 1));
        if(dau== 1) gia= 25;
        if(dau== 2) gia= 34;
        if(dau== 3) gia= 50;
        if(dau== 4) gia= 80;
        

        this.ngaynhan= ngaynhan;
        this.ngaytra= ngaytra;
        this.songay= hdks.tinh(ngaynhan, ngaytra)+ 1;

        this.tienphatsinh= Integer.parseInt(tien);
        tong= gia* songay+ tienphatsinh;
    }

    static long tinh(String nhan,String tra) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date firstDate = (Date) sdf.parse(nhan);
        Date secondDate = (Date) sdf.parse(tra);

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS; 
        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
        return diffrence;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ sophong+ " "+ songay+ " "+ tong;
    }
}