
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * J07051tinhtienphong
 */
public class J07051tinhtienphong {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc= new Scanner(new File("KHACHHANG.in"));
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tinhtienphong> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new tinhtienphong(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
            
        }

        Collections.sort(a, new Comparator<tinhtienphong>() {
            public int compare(tinhtienphong truoc, tinhtienphong sau)
            {
                if(truoc.tong< sau.tong) return 1;
                return -1;
            }
        });

        for(tinhtienphong i: a)
            System.out.println(i);
    }
}

class tinhtienphong
{
    String ma;
    String ten= "";
    int sophong;
    String ngaynhan;
    String ngaytra;
    long songay, tong;
    int tienphatsinh;

    tinhtienphong(int i, String ten, String sophong, String ngaynhan, String ngaytra, String tien) throws ParseException
    {

        ten= ten.trim();
        sophong= sophong.trim();
        ngaynhan= ngaynhan.trim();
        ngaytra= ngaytra.trim();
        tien= tien.trim();

        this.ma= String.format("KH%02d", i);

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        int gia= 0, dau= 0;
        this.sophong= Integer.parseInt(sophong);
        dau= Integer.parseInt(sophong.substring(0, 1));
        if(dau== 1) gia= 25;
        if(dau== 2) gia= 34;
        if(dau== 3) gia= 50;
        if(dau== 4) gia= 80;
        

        this.ngaynhan= ngaynhan;
        this.ngaytra= ngaytra;
        this.songay= tinhtienphong.tinh(ngaynhan, ngaytra)+ 1;

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