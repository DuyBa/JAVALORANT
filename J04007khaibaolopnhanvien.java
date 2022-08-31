import java.util.Scanner;

public class J04007khaibaolopnhanvien {
    public static void main(String[] args) {
        nv a= new nv();
        a.input();
        a.out();
    }
}

class nv
{
    String stt= "00001";
    String ten;
    String gioiting;
    String ngay;
    String diachi;
    String so;
    String ngay1;
    Scanner sc= new Scanner(System.in);
    void input()
    {
        ten= sc.nextLine();
        gioiting= sc.nextLine();
        ngay= sc.nextLine();
        diachi= sc.nextLine();
        so= sc.nextLine();
        ngay1= sc.nextLine();
    }

    void out()
    {
        System.out.println(stt+ " "+ ten+ " "+ gioiting+ " "+ ngay+ " "+ diachi+ " "+ so+ " "+ ngay1);
    }
}