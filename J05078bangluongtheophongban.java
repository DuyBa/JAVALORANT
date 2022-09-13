import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * J05078bangluongtheophongban
 */
public class J05078bangluongtheophongban {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList <tlg> a= new ArrayList<>();
        Map <String, String> aa= new HashMap<>();
        while(t--> 0)
        {
            String tmp= sc.nextLine();
            String[] s= tmp.split(" ");
            tmp= "";
            for(int i= 1; i< s.length; i++) tmp+= s[i]+ " ";
            aa.put(s[0], tmp.substring(0, tmp.length()- 1));
        }
        t= sc.nextInt();
        sc.nextLine();
        while(t-- >0)
        {
            String tmp =sc.nextLine();
            a.add(new tlg(tmp, aa.get(tmp.substring(tmp.length()- 2)), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }

        String tmp= sc.nextLine();
        System.out.printf("Bang luong phong %s:\n", aa.get(tmp));
        for(tlg i: a)
            if(aa.get(tmp).compareTo(i.phongban)== 0)
                System.out.println(i);
        

    }
}

class tlg
{
    String ma;
    String ten;
    String phongban;
    long luong;

    tlg(String ma, String phongban, String ten, int lcb, int ngay)
    {
        this.ma= ma;
        this.phongban= phongban;
        this.ten= ten;

        int heso= 0;
        String dau= ma.substring(0, 1);
        int nam= Integer.parseInt(ma.substring(1, 3));

        if(dau.charAt(0)== 'A')
        {
            if(nam<= 3) heso= 10;
            else if(nam<= 8) heso= 12;
            else if(nam<= 15) heso= 14;
            else  heso= 20;
        }
        if(dau.charAt(0)== 'B')
        {
            if(nam<= 3) heso= 10;
            else if(nam<= 8) heso= 11;
            else if(nam<= 15) heso= 13;
            else  heso= 16;
        }
        if(dau.charAt(0)== 'C')
        {
            if(nam<= 3) heso= 9;
            else if(nam<= 8) heso= 10;
            else if(nam<= 15) heso= 12;
            else  heso= 14;
        }
        if(dau.charAt(0)== 'D')
        {
            if(nam<= 3) heso= 8;
            else if(nam<= 8) heso= 9;
            else if(nam<= 15) heso= 11;
            else  heso= 13;
        }
        
        luong= lcb* 1000* ngay* heso;
    }

    public String toString()
    {
        return ma+ " "+ ten+ " "+ luong;
    }
}