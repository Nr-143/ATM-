import java.io.*;
import java .util.*;
class main{
 public static void main(String args[])
{  Scanner get=new Scanner(System.in);
   int pin=5432,pin2;
   
   String msg1="\n\t\t\t\tINDIAN ATM ";
    try
    {
      for(int i=0;i<msg1.length();i++)
      {
        System.out.print(msg1.charAt(i));
        Thread.sleep(80);
       }
System.out.println(" \n\n \t \tPlease Insert your card.....");
Thread.sleep(5000);  
System.out.println("\n \t  Hello ALAN");
System.out.println(" \t Enter your pin :");
pin2=get.nextInt();
if(pin == pin2)
{
  process p1=new process();
  p1.display();
}
else
{
 System.out.println("Please Enter valid pin number");
}  
 }

    catch(Exception e){}
}
}
class process
{
 Scanner get=new Scanner(System.in);
  int choice,Total=1000;
  int fifty,hundred,two,five;
   boolean running=true;
  void display()
 {
  System.out.println("\n  \t1.Deposit \t\t2.Withdraw \n\n \t3.Balance Enquiry \t4.Transfer");
 while(running==true)
{
 System.out.println("\n Select Your Process");
 choice=get.nextInt();
switch(choice)
{
   case 1:System.out.println(" \n \t\t\t\tDEPOSIT");
          System.out.println("\n Please Insert your amount!!!$$$");
          deposit();
          break;
   case 2:System.out.println("\n \t\t\t\tWITHDRAW");
          withdraw();
          break;
   case 3:System.out.println("\n \t\t\t\t BALANCE ENQUIRY");
          b_enquiry();
          break;
   case 4:System.out.println("\n \t\t\t\tTRANSFER");
          transfer();
          break;
 default:System.out.println("Wrong SELECTION "); 
}
}
}
void deposit()
{
try{
  Random random=new Random();
  fifty=random.nextInt(1,10);
  hundred=random.nextInt(1,10);
  two=random.nextInt(1,10);
  five=random.nextInt(1,10); 
 Thread.sleep(9000);
 System.out.println("\n \t 50 x "+fifty+"="+(50*fifty));Thread.sleep(100);
 System.out.println("\n \t 100 x "+hundred+"="+(100*hundred));Thread.sleep(100);
 System.out.println("\n \t 200 x "+two+"="+(200*two));Thread.sleep(100);
 System.out.println("\n \t 500 x "+five+"="+(500*five));Thread.sleep(100);
  
  Total=Total+ (50*fifty)+(100*hundred)+(200*two)+(500*five);
 System.out.println("\t\t-----");
 System.out.println(" \t TOTAL:"+Total);
  System.out.println("\t\t-----");
}catch(Exception e){}  
}
void withdraw()
{
  String msg2=" \n \t \t Transaction has been processing...";
  String msg3="\n \t \t Remaining balance";
  System.out.println("YOUR ACCOUNT BALANCE :"+Total);
  System.out.println("\nEnter amount:");
  int amount=get.nextInt();
try{
  if (amount<=Total)
  {
  for(int i=0;i<msg2.length();i++)
  {
     System.out.print( msg2.charAt(i) );
      Thread.sleep(80);
  }
System.out.println("\n");
System.out.println("\n Please collect your cash....");
 Thread.sleep(6000);
 }
 for(int i=0;i<msg3.length();i++)
  {
     System.out.print( msg3.charAt(i) );
      Thread.sleep(80);
  }
Total=Total-amount;
System.out.println("\n \t\t\t "+Total);
}catch(Exception e){}
}
void b_enquiry()
{
 System.out.println("\n \t\t\t\t AVAILABLE BALANCE:"+Total);
}
void transfer()
{
try{
 System.out.println("\n\n \t  Enter Account Details....");
 System.out.println("\n\nAccount No:");
 long acc=get.nextLong();
 System.out.println("IFSC Code:");
 long ifsc=get.nextLong();
 System.out.println("Enter amount:");
 int t_amount=get.nextInt();
 Total=Total-t_amount;
 System.out.println("Processing your request");
 for(int i=1;i<=50;i++)
{
 System.out.print("|");
 Thread.sleep(100);
}
System.out.println("\n\n\t\t\t\t $$$ TRANSFER COMPLETED $$$");
}catch(Exception e){}
}
}
