package Inheritance;

public class LoginPage implements BasePage {
    public LoginPage() {
        System.out.println("Login page");
    }

    public void logIn() {
        System.out.println("");
        SecondPage secondPage = new SecondPage();
        secondPage.getPicture();
        String t= title;
    }




}
