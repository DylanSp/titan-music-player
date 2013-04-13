
package com.titanplayer.bll;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    
    ArrayList<Song> songs;
    
    public Library () {
        songs = new ArrayList<Song>();
    }
    
    public int getSongCount () {
        return songs.size();
    }

    public Song getSong(int i) {
        return songs.get(i);
    }
    
    public void addSong(Song songToAdd) {
        songs.add(songToAdd);
    }
    
    public void removeSong(int i) {
        songs.remove(i);
    }

    public void sortByTitle() {
        Collections.sort(songs, new TitleSorter());
    }
    
    public void sortByArtist () {
        Collections.sort(songs, new ArtistSorter());
    }

    
    
}
