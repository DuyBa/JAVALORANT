import java.util.Scanner;

public class J04013baitoantuyensinh {
    public static void main(String[] args) {
        ts a= new ts();
        a.input();
        a.out();
    }
}

class ts
{
    String mts;
    String ten;
    double toan;
    double li;
    double hoa;
    Scanner sc= new Scanner(System.in);

    void input()
    {
        mts= sc.nextLine();
        ten= sc.nextLine();
        toan= sc.nextDouble();
        li= sc.nextDouble();
        hoa= sc.nextDouble();
    }

    void out()
    {
        double ut= 0;
        if(mts.charAt(2)== '1') ut+= 0.5;
        if(mts.charAt(2)== '2') ut+= 1.0;
        if(mts.charAt(2)== '3') ut+= 2.5;
        double tong= toan*2+ li+ hoa;
        System.out.printf("%s %s ", mts, ten);
        if(ut== 1) System.out.print("1 ");
        else System.out.printf("%f ", ut);
        if(tong- (int) tong== 0) System.out.print((int) tong);
        else System.out.print(tong);
        if(tong+ ut>= 24) System.out.print(" TRUNG TUYEN");
        else System.out.print(" TRUOT");
    }
}