import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 * J05033sapxepthoigian
 */
public class J05033sapxepthoigian {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList <time> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add(new time(sc.nextLine()));
        }
        Collections.sort(a, new Comparator<time>() {
            public int compare(time truoc, time sau)
            {
                if(truoc.gio!= sau.gio) return truoc.gio- sau.gio;
                if(truoc.phut!= sau.phut) return truoc.phut- sau.phut;
                if(truoc.giay!= sau.giay) return truoc.giay- sau.giay;
                return 0;
            }
        });
        for(time i : a) System.out.println(i.a);
    }
}

class time
{
    String a;
    Integer gio, phut, giay;
    time(String tmp)
    {
        this.a= tmp;
        String[] b= a.split(" ");
        this.gio= Integer.parseInt(b[0]);
        this.phut= Integer.parseInt(b[1]);
        this.giay= Integer.parseInt(b[2]);
    }
}