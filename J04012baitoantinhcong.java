import java.util.Scanner;

public class J04012baitoantinhcong {
    public static void main(String[] args) {
        nvv a= new nvv();
        a.input();
        a.out();
    }
}

class nvv{
    String ten;
    long tien;
    long so;
    String loai;
    Scanner sc= new Scanner(System.in);

    void input()
    {
        ten= sc.nextLine();
        tien= sc.nextLong();
        so= sc.nextLong();
        sc.nextLine();
        loai= sc.nextLine();
    }

    void out()
    {
        long luongthang= tien* so;
        long luongthuong= 0;
        if(so>= 25) luongthuong+= luongthang* 20/ 100;
        else if(so>= 22) luongthuong+= luongthang* 10/ 100;
        long luongphucap= 0;
        if(loai.compareTo("GD")== 0) luongphucap= 250000;
        if(loai.compareTo("PGD")== 0) luongphucap= 200000;
        if(loai.compareTo("TP")== 0) luongphucap= 180000;
        if(loai.compareTo("NV")== 0) luongphucap= 150000;
        System.out.printf("NV01 %s %d %d %d %d", ten, luongthang, luongthuong, luongphucap, luongthang+ luongthuong+ luongphucap);
    }
}
