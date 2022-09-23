import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07071tenviettat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DANHSACH.in"));
        ArrayList <danhsachten> a= new ArrayList<>();
        int t= sc.nextInt();
        sc.nextLine();
        while(t--> 0)
        {
            a.add(new danhsachten(sc.nextLine()));
        }
        Collections.sort(a, new Comparator<danhsachten>() {
            public int compare(danhsachten truoc, danhsachten sau)
            {
                if(truoc.tenn.compareTo(sau.tenn)!=0) return truoc.tenn.compareTo(sau.tenn);
                if(truoc.tenn.compareTo(sau.tenn)==0&& truoc.ho.compareTo(sau.ho)!=0) return truoc.ho.compareTo(sau.ho);
                if(truoc.tenn.compareTo(sau.tenn)==0&& truoc.ho.compareTo(sau.ho)==0&& truoc.hodem.compareTo(sau.hodem)!=0) return truoc.hodem.compareTo(sau.hodem);
                return -1;
            }
        });
        int n= sc.nextInt();
        sc.nextLine();
        while(n--> 0)
        {
            String tmp= sc.nextLine();
            int diachi= -1;
            for(int i= 0; i< tmp.length(); i++) 
            {
                if(tmp.charAt(i)== '*')
                {
                    diachi= i;
                    break;
                }
            }
            for(danhsachten i: a)
            {
                String res= "";
                if(diachi!= -1) 
                {
                    res= i.tat.substring(0, diachi)+ "*"+ i.tat.substring(diachi+ 1);
                    if(res.compareTo(tmp)== 0) System.out.println(i);
                }
                else
                {
                    if(tmp.compareTo(i.tat)== 0)
                        System.out.println(i);
                }
            }
        }
    }
}

class danhsachten
{
    String ten;
    String tat= "";
    String ho, tenn, hodem;

    danhsachten(String ten)
    {
        this.ten= ten;
        String[] tmp= ten.split(" ");
        this.ho= tmp[0]; this.tenn= tmp[tmp.length- 1]; this.hodem= tmp[1];
        for(String i: tmp) tat+= i.substring(0, 1).toUpperCase()+ ".";
        tat= tat.substring(0, tat.length()- 1);
    }

    public String toString()
    {
        return ten;
    }
}