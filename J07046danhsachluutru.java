import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class J07046danhsachluutru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File file= new File("KHACH.in");
        Scanner sc= new Scanner(file);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList <khach> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
            a.add(new khach(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        Collections.sort(a, new Comparator<khach>() {
            public int compare(khach truoc, khach sau)
            {
                if(truoc.ngay< sau.ngay) return 1;
                return -1;
            }
        });
        for(khach i: a)
            System.out.println(i);
    }
}

class khach
{
    String ma;
    String ten;
    String phong;
    String vao, ra;
    long ngay;

    khach(int i, String ten, String phong, String vao, String ra) throws ParseException
    {
        this.ma= String.format("KH%02d", i);
        this.ten= ten;
        this.phong= phong;
        this.vao= vao; this.ra= ra;
        this.ngay= tinh(vao, ra);
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
        return ma+ " "+ ten+ " "+ phong+ " "+ ngay;
    }
}