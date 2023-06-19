package com.codecool.musiclibrary.ui;

import com.codecool.musiclibrary.model.Song;
import com.codecool.musiclibrary.ui.Library;
import java.util.List;
import java.util.Scanner;

public class MusicLibraryUi {
    private Library library;
    private Logger logger;

    public MusicLibraryUi(Library library, Logger logger) {
        this.library = library;
        this.logger = logger;
    }

    public void run() {
        displayWelcomeMessage();

        int code = 0;

        while (code != 6) {
            displayMenu();
            code = getCode();

            switch (code) {
                case 1 -> addSong();
                case 2 -> viewLibrary();
                case 3 -> searchSongsByArtist();
                case 4 -> removeSong();
                case 5 -> clearLibrary();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void displayWelcomeMessage() {
        System.out.println("Welcome to Codecool Music Library.");
    }

    private void displayMenu() {
        System.out.println("1 - Add Song");
        System.out.println("2 - View Library");
        System.out.println("3 - Search Songs");
        System.out.println("4 - Remove Song");
        System.out.println("5 - Clear Library");
        System.out.println("6 - Exit");
    }

    private int getCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void addSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the song: ");
        String name = scanner.nextLine();

        System.out.print("Enter the artist name: ");
        String artist = scanner.nextLine();

        System.out.print("Enter the duration in seconds: ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        library.addSong(name, artist, duration);
        logger.LogInfo("Song added: " + name + " by " + artist);
        System.out.println("Song added successfully!");
    }

    private void viewLibrary() {
        List<Song> songs = library.viewLibrary();
        System.out.println("Library Songs:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    private void searchSongsByArtist() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the artist name: ");
        String artist = scanner.nextLine();

        List<Song> songs = library.SearchSongByArtist(artist);
        if (songs.isEmpty()) {
            System.out.println("No songs found for artist: " + artist);
        } else {
            System.out.println("Songs by artist " + artist + ":");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    private void removeSong() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the song to remove: ");
        String name = scanner.nextLine();

        library.removeSong(name);
        logger.LogInfo("Song removed: " + name);
        System.out.println("Song removed successfully!");
    }

    private void clearLibrary() {
        library.ClearLibrary();
        logger.LogInfo("Library cleared");
        System.out.println("Library cleared successfully!");
    }
}
