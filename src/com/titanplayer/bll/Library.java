
package com.titanplayer.bll;

import java.util.ArrayList;

public class Library {
    
    ArrayList<Song> songs;
    
    public Library () {
        songs = new ArrayList<Song>();
    }
    
    public int getSongCount () {
        return songs.size();
    }

    public void addSong(Song songToAdd) {
        songs.add(songToAdd);
    }

    public Song getSong(int i) {
        return songs.get(i);
    }

    public void removeSong(int i) {
        songs.remove(i);
    }

}
