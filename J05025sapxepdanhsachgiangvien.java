import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


public class J05025sapxepdanhsachgiangvien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <sxdsgv> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
            a.add(new sxdsgv(i, sc.nextLine(), sc.nextLine()));

        Collections.sort(a, new Comparator<sxdsgv>() {
            public int compare(sxdsgv truoc, sxdsgv sau)
            {
                if(truoc.tenn[truoc.tenn.length- 1].compareTo(sau.tenn[sau.tenn.length- 1])> 0) return 1;
                if(truoc.tenn[truoc.tenn.length- 1].compareTo(sau.tenn[sau.tenn.length- 1])== 0) if(truoc.ma.compareTo(sau.ma)> 0) return 1;
                return -1;
                
            }
        });

        for(sxdsgv i: a)
            System.out.println(i);

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