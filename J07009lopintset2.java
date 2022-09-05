import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07009lopintset2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

class IntSet
{
    int[] a;

    IntSet(int[] a)
    {
        this.a= a;
        // Arrays.sort(this.a);
    }

    IntSet intersection(IntSet b)
    {
        int[] ck= new int[3003];
        for(int i= 0; i< this.a.length; i++)
            ck[this.a[i]]= 1;
        for(int i= 0; i< b.a.length; i++)
            if(ck[b.a[i]]== 1)    
                ck[b.a[i]]= 2;
        
        IntSet tmp= new IntSet(ck);
        return tmp;
    }

    public String toString()
    {
        String a= new String();
        for(int i= 0; i< this.a.length; i++) 
            if(this.a[i]== 2)
                a+= String.valueOf(i) + " ";
        a= a.substring(0,a.length()- 1);
        return a;
    }
}