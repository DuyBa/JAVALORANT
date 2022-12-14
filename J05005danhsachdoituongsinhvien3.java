import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J5004danhsachdoituongsinhvien2
 */
/**
 * J05005danhsachdoituongsinhvien3
 */
public class J05005danhsachdoituongsinhvien3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dssv3> a= new ArrayList<dssv3>();
        for(int i= 1; i<= t; i++)
        {
        	a.add(new dssv3(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        	if(i<t) sc.nextLine();
        }


        Collections.sort(a, new Comparator<dssv3>() {
            public int compare(dssv3 truoc, dssv3 sau)
            {
                if(sau.diemso> truoc.diemso) return 1;
                return -1;
            }
        });

        for(dssv3 i: a) 
            System.out.println(i);
    }
}

class dssv3
{
    String msv= "B20DCCN";
    String ten="";
    String lop;
    String ngay= "";
    String diem;
    double diemso;

    dssv3(int i, String a, String b, String c, double e)
    {
        if(i< 10) msv+= "00";
        else if(i< 100) msv+= "0";
        msv+= String.valueOf(i);
        
        String aaa= a.trim();
        while(aaa.contains("  ")== true)
            aaa= aaa.replace("  ", " ");
        aaa= aaa.toLowerCase();
        String[] adu= aaa.split(" ");
        for(int j= 0; j< adu.length; j++) ten+= Character.toUpperCase(adu[j].charAt(0))+ adu[j].substring(1)+ " "; 
        ten= ten.substring(0, ten.length()- 1);
        
        lop= b;
        
        String[] tmp= c.split("/");
        if(Integer.parseInt(tmp[0])< 10) ngay+= "0";
        ngay+= tmp[0]+ "/";
        if(Integer.parseInt(tmp[1])< 10) ngay+= "0";
        ngay+= tmp[1]+ "/"+ tmp[2];

        diem= String.format("%.2f", e);
        diemso= e;
    }

    public String toString()
    {
        return msv+ " "+ ten+ " "+ lop+ " "+ ngay+ " "+ diem;
    }
}
