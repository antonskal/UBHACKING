import java.io.File; //file class
import java.io.FileNotFoundException; //class to handle errors
import java.io.IOException;
import java.util.Scanner; //scanner class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.PrintWriter;
import java.io.PrintStream;

public class everythingRussianStar {
	public static void main(String [] ars)
	{
		char [] Russian = {' ','.',',','!',';','А','а', 'Б', 'б', 'В', 'в', 'Г', 'г', 'Д', 'д', 'Е' , 'е', 'Ё', 'ё', 'Ж', 'ж', 'З' , 'з', 'И' , 'и', 'Й', 'й', 'К', 'к', 'Л' ,'л', 'М', 'м', 'Н', 'н', 'О' , 'о', 'П', 'п', 'Р' ,'р', 'С', 'с', 'Т', 'т', 'У' ,'у', 'Ф','ф', 'Х', 'х', 'Ц', 'ц', 'Ч', 'ч', 'Ш', 'ш', 'Щ', 'щ', 'Ъ', 'ъ', 'Ы', 'ы', 'Ь', 'ь', 'Э', 'э', 'Ю', 'ю', 'Я', 'я'};
		String [] English = {" " ,".",",","!",";","A", "a", "B", "b", "V", "v", "G", "g", "D", "d", "Ye" ,"ye", "Yo", "yo","J","j","Z","z","I","i","Iy", "iy", "K", "k","L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "R", "r", "S", "s", "T", "t","U", "u","F", "f", "H", "h", "Ts", "ts", "Ch", "ch", "Sh", "sh", "Sch", "sch", "-", "-", "Y", "y", "-", "-", "E", "e", "Yu", "yu", "Ya", "ya"}; 
		System.out.println(Russian.length);
		System.out.println(English.length);
		try {
			System.out.println("Enter the file name with extension :");
			//declare a scanner
			//to pass a file name 
			//on Mac: option plus right click on file and then copy the path
			//on P.C.: hold shift plus right click and copy file path
			Scanner scnr = new Scanner(System.in);
			//pass the scanner to the file created
			File input = new File(scnr.nextLine());
			//update the scanner with the file and print messages
			scnr = new Scanner(input);
			//create an output file
			PrintWriter output = new PrintWriter("someOutputFile.txt"); 
			if(input.exists()) {
				System.out.println("File name: " + input.getName());
				System.out.println("Absoulte path: " + input.getAbsolutePath());
				System.out.println("Writable: " + input.canWrite());
				System.out.println("Readable: " + input.canRead());
				System.out.println("File byte size: " +input.length());
				}
			else {
			System.out.println("File does not exist");
			}
			System.out.println("Russian Song by Yuri Nikulin:");
			while(scnr.hasNextLine()) {
				String token = scnr.nextLine();
				System.out.println(token);
				for(int i = 0; i < token.length(); i++) {
					for(int x = 0; x < Russian.length; x++) {
						if(token.charAt(i)==(Russian[x])) {
							output.print(English[x]);
						}
							}
					}
				output.println();
			
				}
			System.out.println("English letters will be in the someOutputFile");
		}
			
		catch (IOException e) {
			System.out.println("An error has occured");
			e.printStackTrace();
		      }
		
		}
	}


