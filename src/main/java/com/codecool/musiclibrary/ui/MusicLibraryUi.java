package com.codecool.musiclibrary.ui;

import java.util.Scanner;

public class MusicLibraryUi {

    public void run() {
        displayWelcomeMessage();

        int code = 0;

        while (code != 6) {
            displayMenu();
            code = getCode();

            switch (code) {
                case 1 -> addSong();
                case 2 -> viewLibrary();

                //...
            }
            //...
        }
    }

    private static void displayWelcomeMessage() {
        System.out.println("Welcome to Codecool Music Library.");
    }

    private static void displayMenu() {
        System.out.println("1 - Add Song");
        System.out.println("2 - View Library");
        System.out.println("3 - Search Songs");
        System.out.println("4 - Remove Song");
        System.out.println("5 - Clear Library");
        System.out.println("6 - Exit");
    }

    private static int getCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addSong() {
    }

    private static void viewLibrary() {
    }
}

