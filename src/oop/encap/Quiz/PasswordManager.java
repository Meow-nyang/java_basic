package oop.encap.Quiz;

public class PasswordManager {

    private String password;

    //생성자
    public PasswordManager(String initialPassword) {
        this.password = initialPassword;

    }

    public boolean changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

}
