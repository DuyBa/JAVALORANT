import java.util.Scanner;

public class baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ten= sc.nextLine();
        long lcb= sc.nextLong();
        int ngay= sc.nextInt();
        sc.nextLine();
        String chuc= sc.nextLine();

        long thuong= 0;
        long phucap= 0;
        long thunhap= 0;
        long luong= ngay* lcb;

        if(ngay>= 25) thuong= luong/ 100* 20;
        else if(ngay>= 22) thuong= luong/ 100 *10;

        if(chuc.compareTo("GD")== 0) phucap= 250000;
        if(chuc.compareTo("PGD")== 0) phucap= 200000;
        if(chuc.compareTo("TP")== 0) phucap= 180000;
        if(chuc.compareTo("NV")== 0) phucap= 150000;
    
        thunhap= luong+ thuong+ phucap;

        System.out.print("NV01 "+ ten+ " "+ luong+ " "+ thuong+ " "+ phucap+ " "+ thunhap);
    }
}
