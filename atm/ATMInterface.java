import functions.Withdraw;
import functions.Deposit;
import functions.Transfer;
import functions.History;
import static java.lang.System.out;
import java.util.Scanner;

public class ATMInterface
{
int ch1,ch2;
int count=0;
String userId="koyana",userPin="pass";
static int balance=100000;
void register()
{
Scanner sc=new Scanner(System.in);
out.println("Enter your name");
String name=sc.nextLine();
out.println("Enter user id");
userId=sc.next();
out.println("Enter user pin/password");
userPin=sc.next();
out.println("Enter account number");
long acc=sc.nextLong();
out.println("\n\nRegister Successfully....");
}
void login()
{
Scanner sc=new Scanner(System.in);
out.println("Enter user id");
String uName=sc.next();
out.println("Enter user pin/password");
String uPass=sc.next();
if((uName.equals(userId)) && (uPass.equals(userPin)))
{
out.println("Login Successfully");
}
else
{
count++;
out.println("Invalid Credentials\n\nTry Again...");
if(count<3)
login();
else
{
out.println("Three Attemps are over,\n..........Can't try Today...........");
System.exit(0);
}
}
}
void functions()throws Exception
{
Scanner sc=new Scanner(System.in);
Withdraw wth= new Withdraw(); 
Deposit depo=new Deposit();
Transfer trf= new Transfer();
History hist= new History();
while(true)
{
out.println("\n\n.........All ATM Functionalities..........");
out.println("1) Transaction History\n2) Withdraw\n3) Deposit\n4) Check Balance\n5) Transfer\n6) Quit\n");
out.println("Enter user's choice");
int ch3=sc.nextInt();
switch(ch3)
{
case 1:
hist.prevHist();
break;
case 2:
balance=wth.deduct(balance);
break;
case 3:
balance=depo.add(balance);
break;
case 4:
out.println("Current Balance in your Account = "+balance);
break;
case 5:
balance=trf.send(balance);
break;
case 6:
System.exit(0);
default:
out.println("Invalid choice");
System.exit(0);
}
}
}
public static void main(String...arg)throws Exception
{
ATMInterface obj1=new ATMInterface();
Scanner sc=new Scanner(System.in);
out.println("Welcome to ATM");
out.println("---Automated Teller Machine---");
out.println();
out.println("1. Register\n2. Login\n3. Exit\n---------------------\nEnter your choice");
obj1.ch1=sc.nextInt();
switch(obj1.ch1)
{
case 1:
obj1.register();
out.println("1. Login\n2. Exit\n---------------------\nEnter your choice");
obj1.ch2=sc.nextInt();
switch(obj1.ch2)
{
case 1:
obj1.login();
obj1.functions();
break;
case 2:
System.exit(0);
default:
out.println("Invalid choice");
System.exit(0);
}
break;
case 2:
obj1.login();
obj1.functions();
break;
case 3:
System.exit(0);
default:
out.println("Invalid choice");
System.exit(0);
}
}
}