import java.util.Scanner;
public class MarksException extends RuntimeException
{
public MarksException()
{
System.out.println("Enter marks below 100");
}
}

class Student_excep
{
String name;
int marks;
public static void main (String args[])
{
int total_marks=0;
Student_excep arr[]=new Student_excep[5];
for(int j=0;j<5;j++)
{
arr[j]=new Student_excep();
}
Scanner s=new Scanner(System.in);
System.out.println("Enter the name of the five students:");
try
{
for(int i=0;i<5;i++)
{
arr[i].name=s.next();
}
System.out.println("Enter the marks of the five students:");
for(int k=0;k<5;k++)
{
arr[k].marks=s.nextInt();
if(arr[k].marks>100)
{
try
{
throw new MarksException();
}
catch(MarksException e)
{
System.out.println("Exception raised");
}
}
else
{
total_marks=total_marks+arr[k].marks;
}
}
System.out.println("The total marks is:"+total_marks);
}
catch(Exception e)
{
System.out.println("Enter only integer values for marks");
}

}
}
