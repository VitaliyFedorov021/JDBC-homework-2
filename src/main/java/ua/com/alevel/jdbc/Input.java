package ua.com.alevel.jdbc;

import java.util.Scanner;

public class Input {
    public static String input(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String str = sc.nextLine();
        return str;
    }
}
