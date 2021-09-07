import java.util.Scanner;

public class App {
    public static Scanner scan;
    public final static String passWord = "edwin1234";

    public static void main(String[] args) throws Exception {

        checkPassword();

    }

    public static String userInput() {

        scan = new Scanner(System.in);
        String input = scan.nextLine();

 
        return input;

    }

    public static void checkPassword() {

        for (int i = 0; i < 3; i++) {
            String userInput = userInput();
            if (userInput.equals(passWord)) {
                System.out.println("Welcome!");

            } else {
                System.out.println("wrong password, try again");
            }

        }
       System.out.println("too many tries, you are locked out");
       scan.close();
    }
  

}
