
import java.util.ArrayList;
import java.util.Scanner;

public class J05026danhsachgiangvientheobomon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <sxdsgv> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
            a.add(new sxdsgv(i, sc.nextLine(), sc.nextLine()));

        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String tmp= sc.nextLine();
            String monn= new String();
            tmp= tmp.toUpperCase();
            monn+= tmp.charAt(0);
            for(int j= 1; j< tmp.length(); j++) if(tmp.charAt(j- 1)== ' ') monn+= tmp.charAt(j);
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", monn);
            for(sxdsgv i: a) 
                if(i.mon.compareTo(monn)== 0) 
                    System.out.println(i);
        }

        

    }
}

class sxdsgv
{
    String ma= "GV";
    String ten;
    String[] tenn;
    String mon= "";

    sxdsgv(int i, String ten, String mon)
    {
        if(i< 10) ma+= "0";
        ma+= String.valueOf(i);
        this.ten= ten;
        this.tenn= ten.split(" ");
        mon= mon.toUpperCase();
        this.mon+= mon.charAt(0);
        for(int j= 1; j< mon.length(); j++) if(mon.charAt(j- 1)== ' ') this.mon+= mon.charAt(j);
    }

    public String toString()
    {
        String a= "";
        a+= ma+ " "+ ten+ " "+ mon;
        return a;
    }
}