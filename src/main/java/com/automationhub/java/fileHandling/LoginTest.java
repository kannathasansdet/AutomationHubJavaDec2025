package com.automationhub.java.fileHandling;

public class LoginTest {

    public static void main(String[] args) {

        System.out.println("Browser: " + ConfigReader.getProperty("browser"));
        System.out.println("URL: " + ConfigReader.getProperty("url"));

        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Launching Chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Launching Firefox");
        }

/*
        String result = switch (browser.toLowerCase()) {
            case "chrome" -> {
                System.out.println("Chrome driver initialized");
                yield "PASS";
            }
            case "firefox" -> {
                System.out.println("Firefox driver initialized");
                yield "PASS";
            }
            default -> {
                System.out.println("Unsupported browser");
                yield "FAIL";
            }
        };

        System.out.println("Browser setup: " + result);
*/

/*
        int day = 6;

        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
*/

    }
}
