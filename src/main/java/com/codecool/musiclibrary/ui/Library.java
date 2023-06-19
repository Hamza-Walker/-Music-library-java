package com.codecool.musiclibrary.ui;

import com.codecool.musiclibrary.model.Song;

import java.util.List;

public interface Library {
    void addSong(String name, String artist, int duration);
    List<Song> viewLibrary();
    List<Song> SearchSongByArtist(String artist);
    void removeSong (String name);
    void ClearLibrary();
}
