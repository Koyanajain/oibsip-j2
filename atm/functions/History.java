package functions;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
public class History
{
public void prevHist()throws Exception
{
out.println("........All Transaction History.........\n");
File file=new File("E:\\Oasis_Java\\atm\\functions\\history.txt");
FileReader fr= new FileReader(file);
BufferedReader br=new BufferedReader(fr);
String output;
while((output=br.readLine()) != null)
out.println(output);
}
}