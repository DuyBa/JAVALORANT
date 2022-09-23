import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07057diemtuyensinh
 */
public class J07057diemtuyensinh {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("THISINH.in"));
        ArrayList <thisinhh> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        for(int i= 1;i<= t; i++)
        {
            
            a.add(new thisinhh(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(a, new Comparator<thisinhh>() {
            public int compare(thisinhh truoc, thisinhh sau)
            {
                if(truoc.tongdiem< sau.tongdiem) return 1;
                if(truoc.tongdiem== sau.tongdiem) return truoc.ma.compareTo(sau.ma);
                return -1;
            }
        });

        for(thisinhh i: a)
            System.out.println(i);
    }
}

class thisinhh
{
    String ma;
    String ten= "";
    double tongdiem;
    String status;
    int khu;
    double diem;

    thisinhh(int i, String ten, String diem , String dantoc, String khu)
    {
        this.ma= String.format("TS%02d", i);
        

        ten= ten.trim();
        String[] tmp= ten.split("\\s+");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        this.khu= Integer.parseInt(khu);

        double uutien= 0;
        if(this.khu== 1) uutien+= 1.5;
        else if(this.khu== 2) uutien+= 1;
        
        if(dantoc.compareTo("Kinh")!= 0) uutien+= 1.5;

        this.diem= Double.parseDouble(diem);

        tongdiem= this.diem+ uutien;

        if(tongdiem< 20.5) status= "Truot";
        else status= "Do";

    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ String.format("%.1f", tongdiem)+ " "+ status ;
    }
}