import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * J07005sokhacnhautrongfil2
 */
public class J07005sokhacnhautrongfil2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1000];
        for (int i = 1; i <= 100000; i++)
            a[dt.readInt()]++;
        for (int i = 0; i < 1000; i++)
            if (a[i] > 0)
                System.out.println(i + " " + a[i]);
        dt.close();
    }
}