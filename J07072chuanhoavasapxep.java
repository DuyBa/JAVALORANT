import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * J07072chuanhoavasapxep
 */
public class J07072chuanhoavasapxep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DANHSACH.in"));
        ArrayList <danhsachtenn> a= new ArrayList<>();
        while(sc.hasNext())
        {
            a.add(new danhsachtenn(sc.nextLine()));
        }
        Collections.sort(a, new Comparator<danhsachtenn>() {
            public int compare(danhsachtenn truoc, danhsachtenn sau)
            {
                if(truoc.tenn.compareTo(sau.tenn)!=0) return truoc.tenn.compareTo(sau.tenn);
                if(truoc.tenn.compareTo(sau.tenn)==0&& truoc.ho.compareTo(sau.ho)!=0) return truoc.ho.compareTo(sau.ho);
                if(truoc.tenn.compareTo(sau.tenn)==0&& truoc.ho.compareTo(sau.ho)==0&& truoc.hodem.compareTo(sau.hodem)!=0) return truoc.hodem.compareTo(sau.hodem);
                return -1;
            }
        });
        for(danhsachtenn i: a)
            System.out.println(i);
    }
}

class danhsachtenn
{
    String ten= "";
    String ho, tenn, hodem;

    danhsachtenn(String ten)
    {
        ten= ten.trim();
        while(ten.contains("  ")== true) ten= ten.replace("  ", " ");
        String[] tmp= ten.split(" ");
        for(String j: tmp) this.ten+= j.substring(0, 1).toUpperCase()+ j.substring(1).toLowerCase()+ " ";
        this.ten= this.ten.trim();

        String[] tmpp= this.ten.split(" ");
        this.ho= tmpp[0]; 
        this.tenn= tmpp[tmpp.length- 1]; 
        this.hodem= tmpp[1];
    }

    public String toString()
    {
        return ten;
    }
}