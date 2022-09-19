import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07034danhsachmonhoc {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("MONHOC.in");
        Scanner sc= new Scanner(file);
        int t= Integer.parseInt(sc.nextLine());
        ArrayList <monhoc> a= new ArrayList<>();
        while(t--> 0)
        {
            a.add(new monhoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(a, new Comparator<monhoc>() {
            public int compare(monhoc truoc, monhoc sau)
            {
                return truoc.ten.compareTo(sau.ten);
            }
        });

        for(monhoc i: a)
            System.out.println(i);
    }   
}

class monhoc
{
    String ma;
    String ten;
    String tinchi;

    monhoc(String ma, String ten, String tinchi)
    {
        this.ma= ma;
        this.ten= ten;
        this.tinchi= tinchi;
    }



    public String toString()
    {
        return ma+ " "+ ten+ " "+ tinchi;
    }
}
