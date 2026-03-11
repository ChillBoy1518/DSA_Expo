import java.util.Scanner;

public class Login {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static boolean authenticate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== LOGIN PAGE =====");
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login Successful!\n");
            return true;
        } else {
            System.out.println("Invalid Username or Password!");
            return false;
        }
    }
}
