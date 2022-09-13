import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05082danhsachkhachhang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <dskh> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
            a.add(new dskh(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        

            Collections.sort(a, new Comparator<dskh>() {
                public int compare(dskh truoc, dskh sau)
                {
                    
                    if(truoc.y!= sau.y) return truoc.y- sau.y;
                    if(truoc.m!= sau.m) return truoc.m- sau.m;
                    if(truoc.d!= sau.d) return truoc.d- sau.d;
                    return -1;
                }
            });

        for(dskh i: a)
            System.out.println(i);
    }
}

class dskh
{
    String ma;
    String ten= "";
    String gt;
    String date= "";
    String add;
    int d, m, y;

    dskh(int i, String ten, String gt, String ngay, String add )
    {
        this.ma= String.format("KH%03d", i);
        this.gt= gt;

        ten= ten.trim();
        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] arrten= ten.split(" ");
        for(int j= 0; j< arrten.length; j++) this.ten+= arrten[j].substring(0, 1).toUpperCase()+ arrten[j].substring(1).toLowerCase()+ " ";
        this.ten= this.ten.substring(0, this.ten.length()- 1);

        String[] arrngay= ngay.split("/");
        this.d= Integer.parseInt(arrngay[0]);
        this.m= Integer.parseInt(arrngay[1]);
        this.y= Integer.parseInt(arrngay[2]);
        if(arrngay[0].length()== 1) this.date+= "0";
        this.date+= arrngay[0]+ "/";
        if(arrngay[1].length()== 1) this.date+= "0";
        this.date+= arrngay[1]+ "/"+ arrngay[2];
        
        
        this.add= add;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ gt+ " "+ add+ " "+ date;
    }

}