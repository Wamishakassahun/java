import java.util.Scanner;

public class looo {
    public static void  main(String[] args){
        Scanner Scannner = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){

            System.out.println("Enter your name:");
            name = Scanner.nextLine();
        }

System.out.println("hello"+ name);

    }

}
