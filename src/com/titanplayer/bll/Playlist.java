
package com.titanplayer.bll;

import java.util.ArrayList;

public class Playlist {
    
    String name;
    ArrayList<Song> songs;
    
    public Playlist() {
        
    }
    
    public Playlist(String newName) {
        name = newName;
    }
    
    public int getSongCount () {
        
        return 0;
    }

    public String getName() {
        return name;
    }
    
    
}
