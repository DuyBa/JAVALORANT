import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05032trenhatgianhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <tngn> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
            a.add(new tngn(sc.nextLine()));
        
        Collections.sort(a, new Comparator<tngn>() {
            public int compare(tngn truoc, tngn sau)
            {
                
                if(truoc.y!= sau.y) return truoc.y- sau.y;
                if(truoc.m!= sau.m) return truoc.m- sau.m;
                if(truoc.d!= sau.d) return truoc.d- sau.d;
                return -1;
            }
        });

        System.out.println(a.get(a.size()- 1));
        System.out.println(a.get(0));   
    }
}

class tngn
{
    String ten;
    int d, m, y;

    tngn(String a)
    {
        String[] tmp= a.split(" ");
        String b= tmp[1];
        this.ten= tmp[0];
        String[] tmp1= b.split("/");
        this.d= Integer.parseInt(tmp1[0]);
        this.m= Integer.parseInt(tmp1[1]);
        this.y= Integer.parseInt(tmp1[2]);
    }

    public String toString()
    {
        return ten;
    }
}