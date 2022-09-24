import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07076sapxepmatran {
    public static void main(String[] args)  throws FileNotFoundException{
        Scanner sc= new Scanner(new File("MATRIX.in"));
        int t= sc.nextInt();
        while(t--> 0)
        {
            int hang= sc.nextInt(), cot= sc.nextInt(), need= sc.nextInt();
            sc.nextLine();
            ArrayList <ArrayList<Integer>> a= new ArrayList<>();
            for(int i= 0; i< hang; i++)
            {
                ArrayList <Integer> aa= new ArrayList<>();
                for(int j= 0; j< cot; j++)
                    aa.add(sc.nextInt());
                a.add(aa);
            }
            ArrayList <Integer> sapxep= new ArrayList<>();
            for(ArrayList<Integer> i: a)
                sapxep.add(i.get(need- 1));
            Collections.sort(sapxep);
            for(int i= 0; i< hang; i++)
            {
                for(int j= 0; j< cot; j++)
                {
                    if(j== need- 1) System.out.print(sapxep.get(i)+ " ");
                    else System.out.print(a.get(i).get(j)+ " ");
                }
                System.out.println("");
            }
        }

    }
}
