import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class J07007lietkecactukhacnhau
{
	public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet
{
    Set <String> a= new HashSet<>();
	List <String> aa;
    
    WordSet(String a) throws FileNotFoundException
    {
        File file= new File(a);
        Scanner sc= new Scanner(file);
        while(sc.hasNext())
        {
        	this.a.add(sc.next().toLowerCase());
        }
        this.aa= new ArrayList<>(this.a);
        Collections.sort(this.aa);
    }

    public String toString()
    {
    	String tmp= "";
        for(String i: aa)
            tmp+= i+ "\n";

    	return tmp;
    }
}