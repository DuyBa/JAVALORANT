import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07045loaiphong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }    
}

class LoaiPhong implements Comparable<LoaiPhong>
{
    String dong;
    String[] tmp;

    LoaiPhong(String dong)
    {
        this.dong= dong;
        this.tmp= dong.split(" ");
    }

    public int compareTo(LoaiPhong sau)
    {
        return this.tmp[1].compareTo(sau.tmp[1]);
    }

    public String toString()
    {
        return dong;
    }
}
