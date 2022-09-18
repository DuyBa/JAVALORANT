import java.util.Scanner;

public class tinhthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ma= sc.nextLine();
        String ten= sc.nextLine();
        long tien= sc.nextLong();
        int heso= Integer.parseInt(ma.substring(2));
        int phucap= 0;
        if(ma.substring(0, 2).compareTo("HT")== 0) phucap= 2000000;
        if(ma.substring(0, 2).compareTo("HP")== 0) phucap= 900000;
        if(ma.substring(0, 2).compareTo("GV")== 0) phucap= 500000;

        long tong= tien* heso+ phucap;

        System.out.print(ma+ " "+ ten+ " "+ heso+ " "+ phucap+ " "+ tong);
    }
}
