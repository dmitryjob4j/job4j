package ru.job4j.condition;

public class LoginAccess {
    public static boolean check(String login){
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }
    public static void main(String[] args){
        String your = "your_name";
        boolean userHasAccess = LoginAccess.check(your);
        System.out.println(userHasAccess);
    }
}
