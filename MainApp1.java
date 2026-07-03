import java.util.Scanner;
public class MainApp1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthService service = new AuthServiceImpl();

        User user = new User();

        System.out.print("Enter username: ");
        user.setUsername(sc.nextLine());

        System.out.print("Enter password: ");
        user.setPassword(sc.nextLine());

        service.register(user);

        System.out.println("\n--- Login ---");

        System.out.print("Username: ");
        String u = sc.nextLine();

        System.out.print("Password: ");
        String p = sc.nextLine();

        if (service.login(u, p)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}