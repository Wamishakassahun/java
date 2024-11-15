
import java.util.scanner;
public class rectangl {
 public static void main(String[] args) {

double x ;
double y ;
double z ;
scanner scanner = new scanner (System.in);

System.out.print("Enter side x:");
x = scanner.nextDouble();
System.out.print("Enter side y:");
y = scanner.nextDouble();
z = Math.sqrt((x*x)+ (y*y));
System.out.print("the hypotenes of the tringle is:" + z);

scanner.close();
}

}