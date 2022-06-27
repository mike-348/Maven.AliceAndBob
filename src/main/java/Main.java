import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        String enterName = "";
        String a = "Alice";
        String b = "Bob";
        boolean loop = true;
        while(loop) {
            System.out.println("Please enter your name...");
            enterName = scan.nextLine();
            if (enterName.equalsIgnoreCase(a)) {
                System.out.println("Hello, Alice.");
                loop = false;
            }
            else if (enterName.equalsIgnoreCase(b)) {
                System.out.println("Hello, Bob.");
                loop = false;
            }
            else {
                System.out.print("Name not recognized. Try again. ");
            }

        }

    }
}
