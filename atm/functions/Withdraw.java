package functions;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
public class Withdraw
{
public int deduct(int b)throws Exception
{
Scanner sc=new Scanner(System.in);
FileWriter fw=new FileWriter("E:\\Oasis_Java\\atm\\functions\\history.txt", true);
out.println("Enter amount to withdraw");
int amt=sc.nextInt();
if(amt+500<b)
{
b=b-amt;
out.println("Amount Rs- "+amt+" Withdraw Successfully");
String data="Amount Rs: "+amt+" Withdraw at ";
fw.write(data+" "+new java.util.Date()+"\n");
fw.close();
}
else
out.println("Insufficient Balance to withdraw");

return b;
}
}