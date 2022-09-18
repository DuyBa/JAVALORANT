import java.util.Scanner;

public class khaibaolopthisinh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ten= sc.nextLine();
        String ngay= sc.nextLine();
        double d1= sc.nextDouble(), d2=sc.nextDouble(), d3= sc.nextDouble();
        double tong= d1+ d2+ d3;
        System.out.print(ten+ " ");
        System.out.print(ngay+ " ");
        System.out.print(String.format("%.1f", tong));
    }
}
