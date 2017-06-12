import java.io.*;
import java.util.*;
public class leap
{
public static void main(String arg[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
if(a%4==0)
{
System.out.println("the given year is leap year");
}
else if(a%400==0)
{
System.out.println("the given year is leap year");
}
else if(a%100==0)
{
System.out.println("the given year is leap year");
}
else
{
System.out.println("the given year is not a leap year");
}
}
}
