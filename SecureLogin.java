import java.util.Scanner;

class SecureLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int attempts = 3;
        boolean loggedIn = false;

        System.out.println("===== SECURE LOGIN SYSTEM =====");

        System.out.print("Create Username: ");
        String username = sc.nextLine();

        System.out.print("Create Strong Password: ");
        String password = sc.nextLine();

        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*[a-z].*") &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[@#$%&*!].*")) {

            System.out.println("Registration Successful!");

        } else {

            System.out.println("Weak Password! Try Again.");
            sc.close();
            return;
        }

        while (attempts > 0) {

            System.out.print("\nEnter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            if (user.equals(username) && pass.equals(password)) {

                System.out.println("\nLogin Successful!");
                System.out.println("Welcome " + username);

                loggedIn = true;
                break;

            } else {

                attempts--;

                System.out.println("Invalid Username or Password!");
                System.out.println("Remaining Attempts: " + attempts);
            }
        }

        if (!loggedIn) {
            System.out.println("\nAccount Locked!");
        }

        sc.close();
    }
}