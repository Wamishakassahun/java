import java.util.Scanner;
public class gam {
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
System.out.println("you are playing game if you wanna quit prass Q or q:");

String respons = Scanner.next();
if (respons.equals("Q") || respons.equals ("q")){
    System.out.println("you  quit the game!");

}

else {
    System.out.println("you are still playing the game ");
}

}
}    
