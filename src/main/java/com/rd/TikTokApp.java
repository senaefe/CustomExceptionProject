package com.rd;
import java.time.Year;

public class TikTokApp {
    private static final int ageLimit = 18;

    public void login(String userName, int birthYear) throws AgeLimitException {
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        if (age < ageLimit) {
            throw new AgeLimitException("Users under 18 can't login to TikTok.");
        } else {
            System.out.println(userName + " logged in to Tiktok");
        }
    }
}

