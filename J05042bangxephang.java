import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05042bangxephang {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <bxh> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add( new bxh(sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(a, new Comparator<bxh>() {
            public int compare(bxh truoc, bxh sau)
            {
                if(truoc.bai!= sau.bai) return sau.bai- truoc.bai;
                if(truoc.luot!= sau.luot) return truoc.luot- sau.luot;
                if(truoc.ten.compareTo(sau.ten)> 0) return 1;
                return -1;
            }
        });

        for(bxh i: a)
            System.out.println(i);
    }
}

class bxh
{
    String ten;
    String dong;
    int bai;
    int luot;

    bxh(String ten, String dong)
    {
        this.ten= ten;
        this.dong= dong;
        String[] a= dong.split(" ");
        this.bai= Integer.parseInt(a[0]);
        this.luot= Integer.parseInt(a[1]);
    }

    public String toString()
    {
        return ten+ " "+ dong; 
    }
}