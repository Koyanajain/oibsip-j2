package functions;
import static java.lang.System.out;
import java.util.Scanner;
import java.io.FileWriter;
public class Deposit
{
public int add(int b)throws Exception
{
Scanner sc=new Scanner(System.in);
FileWriter fw=new FileWriter("E:\\Oasis_Java\\atm\\functions\\history.txt", true);
out.println("Enter amount to Deposit");
int amt=sc.nextInt();
if(amt>=500)
{
b=b+amt;
out.println("Amount Rs- "+amt+" Deposited Successfully");
String data="Amount Rs: "+amt+" Deposited at ";
fw.write(data+" "+new java.util.Date()+"\n");
fw.close();
}
else
{
out.println("Minimum Rs500/- required to Deposit");
}
return b;
}
}