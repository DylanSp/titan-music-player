
package com.titanplayer.tests;

import com.titanplayer.bll.Song;
import com.titanplayer.bll.Library;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTests {

    public LibraryTests() {
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
    public void emptyLibraryTest () {
        Library emptyLibrary = new Library();
        assertEquals(0, emptyLibrary.getSongCount());
        
    }
    
    @Test
    public void addSongCountTest () {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Light My Fire", "The Doors"));
        assertEquals(1, myLibrary.getSongCount());
    }
    
    @Test
    public void addSongTitleTest () {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Light My Fire", "The Doors"));
        assertEquals("Light My Fire", myLibrary.getSong(0).getTitle());
    }
    
    @Test
    public void addSongArtistTest () {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Light My Fire", "The Doors"));
        assertEquals("The Doors", myLibrary.getSong(0).getArtist());
        
    }
    
    @Test
    public void removeSongTest () {
        Library myLibrary = new Library();
        myLibrary.addSong(new Song("Break On Through", "The Doors"));
        myLibrary.removeSong(0);
        assertEquals(0, myLibrary.getSongCount());
    }

}