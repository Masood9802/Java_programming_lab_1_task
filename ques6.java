import java.util.Scanner;
class ques6{
public static void main(String[] orgs){
Scanner obj=new Scanner(System.in);
System.out.println("Enter 1 for Small Pizza:");
System.out.println("Enter 2 for Burger:");
System.out.println("Enter 3 for Chicken Broast:");
System.out.println("Enter 4 for Potato Fries:");
System.out.println("Enter 5 for Chicken Roll:");
System.out.println("Enter 6 for Pasta:");
int item=obj.nextInt();
switch(item){
case 1:
System.out.println("500");
break;
case 2:
System.out.println("200");
break;
case 3:
System.out.println("300");
break;
case 4:
System.out.println("100");
break;
case 5:
System.out.println("200");
break;
case 6:
System.out.println("400");
break;
}
}
}