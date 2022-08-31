import java.util.Scanner;

public class J04005khaibaolopthisinh {
    public static void main(String[] args) {
        sv a= new sv();
        a.input();
        a.out();
    }
}

class sv{
    String ten;
    String ngay;
    double[] a= new double[3];
    double tong= 0;
    Scanner sc= new Scanner(System.in);
    
    void input()
    {
        ten= sc.nextLine();
        ngay= sc.nextLine();
        a[0]= sc.nextDouble();
        a[1]= sc.nextDouble();
        a[2]= sc.nextDouble();

        String[] aa= ngay.split("/");
        String b= "";
        if(aa[0].length()== 1) b+= "0";
        b+= aa[0]+ "/";
        if(aa[1].length()== 1) b+= "0";
        b+= aa[1]+ "/"+ aa[2];
        ngay= b; 
          
        tong= (a[0]+ a[1]+ a[2]);
    }

    void out()
    {
        System.out.print(ten+ " "+ ngay+ " ");
        System.out.printf("%.1f", tong);
    }
}