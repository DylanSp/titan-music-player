
package com.titanplayer.bll;

import java.util.Comparator;

public class ArtistSorter implements Comparator<Song> {
    
    @Override
    public int compare (Song song1, Song song2) {
        String artist1 = song1.getArtist();
        String artist2 = song2.getArtist();
        
        int comparison = artist1.compareTo(artist2);
        
        if (comparison < 0) {
            return -1;
        } else if (comparison == 0) {
            return 0;
        } else {
            return 1;
        }
        
    }
    
}
