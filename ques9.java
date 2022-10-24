import java.util.Scanner;
class ques9{
public static void main(String[] orgs){
Scanner obj=new Scanner(System.in);
int ser1=0;
int ser2=1;
int ser3;
int m=0;
System.out.println("Enter the number of terms:");
int n=obj.nextInt();
System.out.printf("%d\n",ser1);
System.out.printf("%d\n",ser2);
m=2;
while(m<n){
ser3=ser1+ser2;
m++;
System.out.printf("%d\n",ser3);
ser1=ser2;
ser2=ser3;
}
}
}