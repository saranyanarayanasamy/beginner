import java.io.*;
import java.util.*;
public class reverse
{
static public void main(String args[])
{
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
int b=Integer.parseInt();
int a;
for(int i=0;i<s.length;i++)
{
a=b%10;
System.out.print(a);
b=b/10;
}
}
}
