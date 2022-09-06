import java.util.Scanner;

public class J04018sophuc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t--> 0)
        {
            sp a= new sp(sc.nextInt(), sc.nextInt());
            sp b= new sp(sc.nextInt(), sc.nextInt());
            sp c= (a.cong(b)).nhan(a);
            sp d= (a.cong(b)).nhan(a.cong(b));
            c.out();
            System.out.print(", ");
            d.out();
            System.out.println("");
        }
    }
}

class sp
{
    int thuc;
    int ao;

    sp(int t, int a)
    {
        this.thuc= t;
        this.ao= a;
    }

    sp cong(sp b)
    {
        return new sp(this.thuc+ b.thuc,this.ao+ b.ao);
    }

    sp nhan(sp b)
    {
        int tt= this.thuc* b.thuc+ this.ao* b.ao* -1;
        int aa= this.thuc* b.ao+ this.ao* b.thuc;
        return new sp(tt, aa);
    }

    void out()
    {
        String a= new String();
        a+= String.valueOf(thuc)+  " + "+ String.valueOf(ao)+ "i";
        System.out.print(a);
    }
}
