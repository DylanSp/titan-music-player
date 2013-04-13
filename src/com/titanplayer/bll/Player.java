
package com.titanplayer.bll;

public class Player {
    
    Playlist songsToPlay;
    Song songPlaying;
    boolean isPlaying;
    
    public Player () {
        songsToPlay = new Playlist();
    }
    
    public void setPlaylist (Playlist newPlaylist) {
        songsToPlay = newPlaylist;
    }
    
    public void play() {
       isPlaying = true;
    }
    
    public void startPlaying() {
        songPlaying = songsToPlay.getSong(0);
        play();
    }

    public Song getSongPlaying() {
        return songPlaying;
    }

    public void skip() {
        int currentIndex = songsToPlay.indexOf(songPlaying);
        int nextIndex;
        
        //if at the end, return to starting song
        //elsewise, go to next song
        if (currentIndex + 1 == songsToPlay.getSongCount()) {
            nextIndex = 0;
        }
        else {
            nextIndex = currentIndex + 1;
        }
        
        songPlaying = songsToPlay.getSong(nextIndex);
    }
    
    public void stop() {
        isPlaying = false;
    }
    
    public boolean isPlaying () {
        return isPlaying;
    }

}
