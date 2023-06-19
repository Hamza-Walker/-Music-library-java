package com.codecool.musiclibrary.ui;

import com.codecool.musiclibrary.model.Song;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LibraryComponent implements Library {

    private List<Song> songs;
    public LibraryComponent(){
        songs = new ArrayList<>();
    }
    @Override
    public void addSong(String name, String artist, int duration) {
        Song song = new Song (name, artist, duration);
        songs.add(song);
    }

    @Override
    public List<Song> viewLibrary() {
        List<Song> sortedSongs = new ArrayList<>(songs);
        sortedSongs.sort(Comparator.comparing(Song::getArtist));
        return sortedSongs;
    }

    @Override
    public List<Song> SearchSongByArtist(String artist) {
    List<Song> foundSongs = new ArrayList<>();
    for (Song song : songs){
        if (song.getArtist().equalsIgnoreCase(artist)){
            foundSongs.add(song);
        }
    }
    return foundSongs;
    }

    @Override
    public void removeSong(String name) {
    songs.removeIf(song -> song.getName().equalsIgnoreCase(name));
    }

    @Override
    public void ClearLibrary() {
    songs.clear();
    }

}
