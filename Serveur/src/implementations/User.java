package implementations;

public class User {
    String mail;
    String pwd;

    User(String mail, String pwd){
        this.mail = mail;
        this.pwd = pwd;
    }

    boolean equals(User u2){
        return (this.mail.equals(u2.mail) && this.pwd.equals(u2.pwd));
    }
}