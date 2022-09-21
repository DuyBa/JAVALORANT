import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class J07053xettuyen {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("XETTUYEN.in"));
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <xt> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new xt(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            if(i< t) sc.nextLine();
        }


        for(xt i: a)
            System.out.println(i);
    }
}

class xt
{
    String ma= "PH";
    String ten= "";
    int tuoi;
    int diem;
    String xl;

    xt(int i, String ten, String ngay, double lt, double th)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);

        ten= ten.trim();

        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        tuoi= 2021- Integer.parseInt(ngay.substring(ngay.length()- 4));

        double thuong= 0;
        if(lt>= 8&& th>= 8) thuong+= 1;
        else if(lt>= 7.5&& th>= 7.5) thuong+= 0.5;

        diem= (int) Math.round((lt+ th)/ 2+ thuong);
        if(diem> 10) diem= 10;

        if(diem< 5) xl= "Truot";
        if(diem>= 5&& diem<= 6) xl= "Trung binh";
        if(diem== 7) xl= "Kha";
        if(diem== 8) xl= "Gioi";
        if(diem== 9|| diem== 10) xl= "Xuat sac";


    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ tuoi+ " "+ diem+ " "+ xl;
    }
}