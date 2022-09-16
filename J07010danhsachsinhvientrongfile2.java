import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * J07010danhsachsinhvientrongfile2
 */
public class J07010danhsachsinhvientrongfile2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("SV.in");
        Scanner sc= new Scanner(file);
        String t= sc.nextLine();
        ArrayList <dssvtf2> a= new ArrayList<>();
        for(int i= 1; i<= Integer.parseInt(t); i++) a.add(new dssvtf2(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        for(dssvtf2 i: a)
            System.out.println(i);
        
    }
}

class dssvtf2
{
    String ma;
    String ten;
    String lop;
    String date= "";
    String diem;

    dssvtf2(int i, String ten, String lop, String ngay, String diem)
    {
        this.ma= String.format("B20DCCN%03d", i);
        this.ten= ten;
        this.lop= lop;

        String[] tmp= ngay.split("/");
        if(Integer.parseInt(tmp[0])< 10) this.date+= "0";
        this.date+= tmp[0]+ "/";
        if(Integer.parseInt(tmp[1])< 10) this.date+= "0";
        this.date+= tmp[1]+ "/"+ tmp[2];

        this.diem = String.format("%.2f", Double.parseDouble(diem));
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ lop+ " "+ date+ " "+ diem;
    }
}