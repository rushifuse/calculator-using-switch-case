import java.util.*;

class calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Operator:-");
char ch=sc.next().charAt(0);

System.out.println("Enter the First no:-");
double first=sc.nextDouble();

System.out.println("Enter the Second no:-");
double second=sc.nextDouble();

switch(ch)
{
case '+':
double result=first+second;
System.out.println("Addition of two no:-"+result);
break;

case '-':
result=first-second;
System.out.println("substraction of two no:-"+result);
break;

case '*':
 result=first*second;
System.out.println("multiplication of two no:-"+result);
break;

case '/':
result=first/second;
System.out.println("division of two no:-"+result);
break;


default:
System.out.println("operator is not valid");

}


}}