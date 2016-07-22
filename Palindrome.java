import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String inputString;
Scanner in=new Scanner(System.in);
System.out.println("input a String");
inputString=in.nextLine();
int length=inputString.length();
int i, begin, end, middle;
begin=0;
end=length-1;
middle=(begin+end)/2;
for(i=begin;i<=middle;i++)
{
if(inputString.charAt(begin)==inputString.charAt(end))
{
begin++; 
end--;
}
else
{
break;
}
}
if(i==middle+1)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not a Palindrome");
}
}
}
