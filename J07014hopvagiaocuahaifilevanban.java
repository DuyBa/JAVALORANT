import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;


/**
 * J07014hopvagiaocuahaifilevanban
 */
public class J07014hopvagiaocuahaifilevanban {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet
{
    String a= "";
    

    WordSet(String a) throws FileNotFoundException
    {
        Scanner sc= new Scanner(new File(a));
        while(sc.hasNextLine()== true)
            this.a+= sc.nextLine()+ " ";
        this.a= this.a.trim();
    }

    String union(WordSet b)
    {
        String[] tmp= b.a.split(" "), tmp1= this.a.split(" ");
        Set <String> tong= new HashSet<>();
        Collections.addAll(tong, tmp);
        Collections.addAll(tong, tmp1);
        List <String> aaa= new ArrayList<>(tong);
        Collections.sort(aaa);
        String aa= new String();
        for(int i= 0; i< aaa.size(); i++) aa+= aaa.get(i)+ " ";
        aa= aa.substring(0, aa.length()- 1);
        return aa;
    }

    String intersection(WordSet b)
    {
        List <String> list= new ArrayList<>();
        String[] tmp= b.a.split(" "), tmp1= this.a.split(" ");
        for(int i= 0; i< tmp.length; i++) list.add(tmp[i]);
        Set <String> k= new HashSet<>();
        Collections.addAll(k, tmp1);
        Vector <String> kk= new Vector<>();
        for(String i: k ) 
            if(list.contains(i))
                kk.add(i);
        Collections.sort(kk);
        String aa= new String();
        for(int i= 0; i< kk.size(); i++) aa+= kk.get(i)+ " ";
        aa= aa.substring(0, aa.length()- 1);
        return aa;
    }
}