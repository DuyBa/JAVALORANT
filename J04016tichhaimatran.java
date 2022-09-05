import java.util.Scanner;

public class J04016tichhaimatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
        
    }
}

class Matrix
{
    int hang;
    int cot;
    long[][] a;

    Matrix(int aa, int bb)
    {
        this.hang= aa;
        this.cot= bb;
        this.a= new long[aa][bb];
    }

    void nextMatrix(Scanner sc)
    {
        for(int i= 0; i< this.hang; i++)
            for(int j= 0; j< this.cot; j++)
                this.a[i][j]= sc.nextLong();
    }


    String mul(Matrix b)
    {
        Matrix tmp= new Matrix(this.hang, b.cot);
        for(int i=0; i< this.hang; i++)
            for(int j= 0; j< b.cot; j++)
                for(int k= 0; k< b.hang; k++)
                    tmp.a[i][j]+= this.a[i][k]* b.a[k][j];
        return tmp.toString();
    }


    public String toString()
    {
        String tmp= new String();
        for(int i= 0; i< this.hang; i++)
        {
            for(int j= 0; j< this.cot; j++)
            {
            	tmp+= String.valueOf(this.a[i][j]);
            	if(j== this.cot- 1&& i!= this.hang- 1) tmp+= "\n";
            	else tmp+= " ";
            }
        }
        return tmp;      
    }
}