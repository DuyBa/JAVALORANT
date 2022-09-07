import java.util.Scanner;

public class J04006khaibaolopsinhvien {
    public static void main(String[] args) {
        sv1 a= new sv1();
        a.input();
        a.out();
    }
}

class sv1{

    Scanner sc= new Scanner(System.in);
    String msv= "B20DCCN001";
    String ten;
    String lop;
    String ngay;
    double diem;
    
    
    void input()
    {
        ten= sc.nextLine();
        lop= sc.nextLine();
        ngay= sc.nextLine();
        diem= sc.nextDouble();

        String[] aa= ngay.split("/");
        String b= "";
        if(aa[0].length()== 1) b+= "0";
        b+= aa[0]+ "/";
        if(aa[1].length()== 1) b+= "0";
        b+= aa[1]+ "/"+ aa[2];
        ngay= b;

    }

    void out()
    {
        System.out.print(msv+ " "+ ten+ " "+ lop+ " "+ ngay+ " ");
        System.out.printf("%.2f", diem);
    }
}