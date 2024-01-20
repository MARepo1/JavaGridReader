import java.io.File;
import java.io.FileNotFoundException;
public class GameFileTester {
public static void main(String[] args)throws FileNotFoundException{


String filename = "tictactoe.txt";
GridReader displayGrid = new GridReader(filename);


System.out.println(filename + " grid: ");
System.out.println();
System.out.print(displayGrid.getFileName());
System.out.print(displayGrid.getCopy());
System.out.print(displayGrid.toString());

   
   }
}
