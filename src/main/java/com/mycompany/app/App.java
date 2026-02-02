package com.mycompany.app;

import java.util.Scanner;

public class App {

    public String getWelcomeMessage() {
        return "Welcome to CloudWithVarJosh Demo!";
    }

    public boolean isAdminUser(String user) {
        return "admin".equals(user);
    }

    public static void main(String[] args) {

        App app = new App();
        System.out.println(app.getWelcomeMessage());

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter username: ");
            String user = sc.nextLine();

            if (app.isAdminUser(user)) {
                System.out.println("Access granted to admin user.");
            } else {
                System.out.println("Access denied.");
            }
        }
    }
}
