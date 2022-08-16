package functions;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
public class Transfer
{
public int send(int b)throws Exception
{
Scanner sc=new Scanner(System.in);
FileWriter fw=new FileWriter("E:\\Oasis_Java\\atm\\functions\\history.txt", true);
out.println("Enter recepient name to transfer");
String name=sc.nextLine();
out.println("Enter amount to Transfer");
int amt=sc.nextInt();
if(amt+500<b)
{
b=b-amt;
out.println("Amount Rs: "+amt+" Transfer Successfully to "+name);
String data="Amount Rs: "+amt+" Transfer to "+name+" at ";
fw.write(data+" "+new java.util.Date()+"\n");
fw.close();
}
else
out.println("Insufficient Balance to transfer");

return b;
}
}