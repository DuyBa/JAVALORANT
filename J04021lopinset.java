import java.util.Scanner;

public class J04021lopinset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
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

    IntSet union(IntSet b)
    {
        int[] ck= new int[101];
        for(int i= 0; i< this.a.length; i++)
            ck[this.a[i]]++;
        for(int i= 0; i< b.a.length; i++)
            ck[b.a[i]]++;
        
        IntSet tmp= new IntSet(ck);
        return tmp;
    }

    public String toString()
    {
        String a= new String();
        for(int i= 0; i< this.a.length; i++) 
            if(this.a[i]> 0)
                a+= String.valueOf(i) + " ";
        a= a.substring(0,a.length()- 1);
        return a;
    }
}