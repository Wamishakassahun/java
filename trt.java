public class trt {
   public static void main(String[] args)
{
// array used to store mutiple valus in a single variables!
/*String[] cars = new String[3];
cars [0] = "camaro";
cars [1] = "tesila";
cars [2] =  "  BMW";
for(int i=0; i<=cars.length; i++){


   System.out.println(cars[i]);
}
}

}

*/
// 2d array=  an array of arrys
String name[][] = new String[3][3];
name[0][0] ="wami";
name[0][1] ="miwa";
name[0][2] ="amiw";
name[1][0] ="miwa";
name[1][1] = "imwa";
name[1][2] ="awmi";
name[2][0] ="aimw";
name[2][1] ="awim";
name[2][2] ="maiw";
for(int i=0; i<name.length; i++ )
{
   System.out.println(name[i]);
}
   for(int j =0; j< name[i].length; j++){
System.out.println(name[j]);
   }
}
}