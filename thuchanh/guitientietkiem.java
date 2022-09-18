import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class guitientietkiem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(), m= sc.nextInt();
        ArrayList <tien> a= new ArrayList<>();
        while(n--> 0)
        {
            a.add(new tien(sc.nextLong(), sc.nextInt()));
        }
        Collections.sort(a, new Comparator<tien>() {
            public int compare(tien truoc, tien sau)
            {
                if(truoc.gio> sau.gio) return 1;
                if(truoc.gio== sau.gio) if(truoc.tien< sau.tien) return 1;
                return -1;
            }   
        });

        long tong= a.get(0).tien, gio= a.get(0).gio;
        for(int i= 1; i< a.size(); i++)
        {
            if(a.get(i).gio> gio&& a.get(i).gio+ gio<= m)
            {
                tong+= a.get(i).tien;
                gio+= a.get(i).gio;
            }
        }

        System.out.println(tong);
    }
}

class tien
{
    long tien;
    int gio;

    tien(long tien, int gio)
    {
        this.tien= tien;
        this.gio= gio;
    }
}