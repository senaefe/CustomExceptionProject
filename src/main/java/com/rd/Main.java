package com.rd;

public class Main {
    public static void main(String[] args) {
        TikTokApp tikTokApp = new TikTokApp();

        String user1 = "Sena";
        int birthYear1 = 2000; // Sena is 24 age
        String user2 = "Efe";
        int birthYear2 = 2007; // Efe is 17 age

        try {
            tikTokApp.login(user1, birthYear1);
            tikTokApp.login(user2, birthYear2);
        } catch (AgeLimitException e) {
            System.out.println("Error: " + e.getMessage() );
        }
    }
}

