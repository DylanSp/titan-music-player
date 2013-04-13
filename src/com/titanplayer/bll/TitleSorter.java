
package com.titanplayer.bll;

import java.util.Comparator;

public class TitleSorter implements Comparator<Song> {
    
    @Override
    public int compare (Song song1, Song song2) {
        String title1 = song1.getTitle();
        String title2 = song2.getTitle();
        
        int comparison = title1.compareTo(title2);
        
        if (comparison < 0) {
            return -1;
        } else if (comparison == 0) {
            return 0;
        } else {
            return 1;
        }   
  
    }
    
}
