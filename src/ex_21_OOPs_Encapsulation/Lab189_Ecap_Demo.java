package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
       Website website = new Website("admin","pass123");
        System.out.println(website.password);
    }
}


class Website {
    public String username;
    public String Password;

    public Website(String username, String password){
        this.Password = password;
        this.username = username;

    }
}

class Goodwebsit{
    private  String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;
}