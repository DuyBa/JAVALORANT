import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


/**
 * J05028danhsachdoanhnghienhansinhvienthuctap
 */
/**
 * J07037danhsachdoanhnghiep
 */
public class J07037danhsachdoanhnghiep {
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("DN.in");
        Scanner sc= new Scanner(file);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <svtt> a= new ArrayList<>();
        for(int i= 1; i<= t; i++)
        {
            a.add(new svtt(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            if(i< t) sc.nextLine();
        }
            

        Collections.sort(a, new Comparator<svtt>() {
            public int compare(svtt truoc, svtt sau)
            {
                return truoc.ma.compareTo(sau.ma);   
            }
        });

        for(svtt i: a)
            System.out.println(i);

    }
}

class svtt
{
    String ma;
    String ten;
    int so;

    svtt(String ma, String ten, int so)
    {
        this.ma= ma;
        this.ten= ten;
        this.so= so;
    }

    public String toString()
    {
        String a= "";
        a+= ma+ " "+ ten+ " "+ so;
        return a;
    }
}