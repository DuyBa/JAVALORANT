import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class J07021chuanhoaxauhotentrongfile
{
	public static void main(String[] args) throws FileNotFoundException {
		File file= new File("DATA.in");
		Scanner sc= new Scanner(file);
		while(true)
		{
			String a= sc.nextLine().trim();
			if(a.compareTo("END")== 0) break;
			while(a.contains("  ")== true) a= a.replace("  ", " ");
			String[] tmp= a.split(" ");
			String ten=  "";
			for(String i: tmp)
			{
				ten+= i.substring(0, 1).toUpperCase()+ i.substring(1).toLowerCase()+ " ";
			}
			ten= ten.trim();
			System.out.println(ten);
		}
	}
}