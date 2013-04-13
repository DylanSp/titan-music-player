
package com.titanplayer.tests;

import com.titanplayer.bll.Player;
import com.titanplayer.bll.Playlist;
import com.titanplayer.bll.Song;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTests {

    public PlayerTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSkip () {
       Song song1 = new Song("Once", "Pearl Jam");
       Song song2 = new Song("Alive", "Pearl Jam");
       Playlist myPlaylist = new Playlist();
       
       myPlaylist.addSong(song1);
       myPlaylist.addSong(song2);
       
       Player p = new Player();
       p.setPlaylist(myPlaylist);
       p.play();
       Song currentSong = p.getSongPlaying();
       p.skip();
       assertNotEquals(currentSong, p.getSongPlaying());

    }
    
    @Test
    public void testPlay() {
        Player p = new Player();
        p.play();
        assertTrue(p.isPlaying());
    }
    
    @Test
    public void testStop () {
        Player p = new Player();
        p.play();
        p.stop();
        assertFalse(p.isPlaying());
    }

}