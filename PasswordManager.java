/**
 * A sample password manager with just a password change functionality.
 * @Author: Nishith Savla (FCOG19146)
 */

import java.util.Scanner;

public class PasswordManager {

    private String password;

    public PasswordManager(String password) {
        this.password = password;
    }

    public boolean verifyPassword(String currentPassword) {
        return this.password.equals(currentPassword);
    }

    public boolean changePassword(String currentPassword, String newPassword) {
        if (verifyPassword(currentPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        PasswordManager passwordManager = new PasswordManager(scanner.nextLine());
        System.out.print("Do you want to change the password(y/n): ");
        boolean wannaChangePassword = scanner.nextLine().toLowerCase().startsWith("y");
        if (wannaChangePassword) {
            System.out.print("Enter your current password: ");
            String currentPassword = scanner.nextLine();
            System.out.print("Enter new password: ");
            String newPassword = scanner.nextLine();

            boolean passwordChangeSucceed = passwordManager.changePassword(currentPassword, newPassword);

            String message = passwordChangeSucceed ? "Password changed successfully" : "Incorrect Password";
            System.out.print('\n' + message);

        }
    }
}
