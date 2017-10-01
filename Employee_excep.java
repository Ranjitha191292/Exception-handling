import java.util.Scanner;
class SalaryException extends Exception
{
SalaryException()
{
System.out.println("Salary must not be zero 0");
}
SalaryException(String msg)
{
super(msg);
}
}

class AgeException extends Exception
{
AgeException()
{
System.out.println("Age must be above 21");
}
AgeException(String msg)
{
super(msg);
}
}

class AvgSalException extends Exception
{
AvgSalException()
{
System.out.println("Average salary must be above 1 lakh");
}
AvgSalException(String msg)
{
super(msg);
}
}

class Employee_excep
{
String empname;
int empage;
float empsalary;
public static void main (String args[])
{
float sum=0;
float avg;
Employee_excep arr[]=new Employee_excep[10];
for(int j=0;j<10;j++)
{
arr[j]=new Employee_excep();
}
Scanner s=new Scanner(System.in);
System.out.println("Enter the name,age and salary of the 10 employees:");
for(int k=0;k<10;k++)
{
arr[k].empname=s.next();
arr[k].empage=s.nextInt();
try
{
if(arr[k].empage<21)
{
throw new AgeException();
}
}
catch(AgeException e)
{
System.out.println(e);
}
arr[k].empsalary=s.nextFloat();
try
{
if(arr[k].empsalary==0)
{
throw new SalaryException();
}
}
catch(SalaryException e)
{
System.out.println(e);
}
}
for(int m=0;m<10;m++)
{
sum=sum+arr[m].empsalary;
}
avg=sum/10;
try
{
if(avg<100000)
{
throw new AvgSalException();
}
else
{
System.out.println("The average salary is:"+avg);
}
}
catch(AvgSalException e)
{
System.out.println(e);
}
}
}

 