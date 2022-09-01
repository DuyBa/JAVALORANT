import java.util.Scanner;



public class J04015tinhthunhapgiaovien {
    public static void main(String[] args) {
        gv a= new gv();
        a.input();
        a.out();
    }
}

class gv
{
    String ma;
    String ten;
    long tien;
    Scanner sc= new Scanner(System.in);

    void input()
    {
        ma= sc.nextLine();
        ten= sc.nextLine();
        tien= sc.nextLong();
    }

    void out()
    {
        String ck= ""+ this.ma.charAt(0)+ this.ma.charAt(1);
        long luong= 0;
        if(ck.compareTo("HT")== 0) luong+= 2000000;
        else if(ck.compareTo("HP")== 0) luong+= 900000;
        else if(ck.compareTo("GV")== 0) luong+= 500000;
        String k= ""+ ma.charAt(2)+ ma.charAt(3);
        long hs= Long.parseLong(k);
        System.out.printf("%s %s %d %d %d", ma, ten, hs, luong, tien* hs+ luong);
    }

}