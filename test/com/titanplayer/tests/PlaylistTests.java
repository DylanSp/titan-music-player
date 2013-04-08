
package com.titanplayer.tests;

import com.titanplayer.bll.Playlist;
import com.titanplayer.bll.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlaylistTests {

    public PlaylistTests() {
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
    public void emptyPlaylistTest () {
        Playlist myPlaylist = new Playlist();
        assertEquals(0, myPlaylist.getSongCount());
    }
    
    @Test
    public void playlistNameTest () {
        Playlist myPlaylist = new Playlist("Favorite songs");
        assertEquals("Favorite songs", myPlaylist.getName());
    }

}