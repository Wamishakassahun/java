import java.util.Scanner;
public class hypotenus {
public static void main(String[] args)
{
    double x ;
    double y ;
    double z ;
Scanner Scanner = new Scanner(System.in);
System.out.println("Enter x:");
x = Scanner.nextDouble();
System.out.println("Enter y:");
y = Scanner.nextDouble();

z = Math.sqrt((x*x)+(y*y));
System.out.println("the hypotenous:" + z);

Scanner.close();


}
}