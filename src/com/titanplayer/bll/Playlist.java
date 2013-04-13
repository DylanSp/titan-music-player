
package com.titanplayer.bll;

import java.util.ArrayList;

public class Playlist {
    
    private String name;
    private ArrayList<Song> songs;
    
    
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    
    public Playlist(String newName) {
        name = newName;
        songs = new ArrayList<Song>();
    }
    
    public int getSongCount () {
        return songs.size();
    }

    public String getName() {
        return name;
    }
    
    public void addSong (Song newSong) {
        songs.add(newSong);
    }
    
    public Song getSong (int i) {
        return songs.get(i);
    }
    
    public int indexOf (Song mySong) {
        return songs.indexOf(mySong);
    }
    
    
    
    
}
