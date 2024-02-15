/**
 * 
 */
package com.sddevops.junit_maven_eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class SongCollectionTest {
private ArrayList<Song> songs= new ArrayList<>();
private int capacity;
private SongCollection sc;
private Song s1;
private Song s2;
private Song s3;
private Song s4;
private Song s5;
private final int SONG_COLLECTION_SIZE=4;
private final String SONG_FIVE_ID="005";
private final String SONG_FIVE_TITLE="baby";
private final String SONG_FIVE_ARTIST="JUSTIN BREBER";
private final double SONG_FIVE_LENGTH=1.39;

private final String SONG_EIGHT_ID_NOT_EXIST="006";
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//Arrange
		sc = new SongCollection();
		s1 = new Song("0001","good 4 u","Olivia Rodrigo",3.59);
		s2 = new Song("0002","Peaches","Justin Bieber",3.18);
		s3 = new Song("0003","MONTERO","Lil Nas X",2.3);
//		s4 = new Song("0004","bad guy","Billie Eilish",3.14);
		sc.addSong(s1);
		sc.addSong(s2);
		sc.addSong(s3);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		sc=null;
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#SongCollection()}.
	 */
	@Test
	void testSongCollection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#SongCollection(int)}.
	 */
	@Test
	void testSongCollectionInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#getSongs()}.
	 */
	@Test
	void testGetSongs() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#addSong(com.sddevops.junit_maven_eclipse.Song)}.
	 */
	@Test
	void testAddSong() {
		List<Song> testSc=sc.getSongs();
		//Assert that Song Collection is equals to Song Collection Size : 4
		assertEquals(4,testSc.size());
		//Act
		sc.addSong(s1);
		sc.addSong(s2);
		//Assert that Song Collection is equals to Song Collection Size + 1 : 5
		assertEquals(6,testSc.size());
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#sortSongsByTitle()}.
	 */
	@Test
	void testSortSongsByTitle() {
		s4 = new Song("0004","bad guy","Billie Eilish",3.14);
		sc.addSong(s4);
      Song songFound = sc.findSongByTitle("bad guy");
      Song songNotFound=sc.findSongByTitle(SONG_EIGHT_ID_NOT_EXIST);
    	assertEquals(s4,songFound.getArtiste());
      	assertNull(songNotFound);	
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#sortSongsBySongLength()}.
	 */
	@Test
	void testSortSongsBySongLength() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#findSongsById(java.lang.String)}.
	 */
	@Test
	void testFindSongsById() {
		//Arange
	s5 = new Song(SONG_FIVE_ID,SONG_FIVE_TITLE,SONG_FIVE_ARTIST,SONG_FIVE_LENGTH);
	sc.addSong(s5);
	
	//Act
	Song songFound = sc.findSongsById(SONG_FIVE_ID);
	Song songNotfound=sc.findSongsById(SONG_EIGHT_ID_NOT_EXIST);
	//Assert
	assertEquals(SONG_FIVE_ARTIST,songFound.getArtiste());
	assertNull(songNotfound);
	}

	/**
	 * Test method for {@link com.sddevops.junit_maven_eclipse.SongCollection#findSongByTitle(java.lang.String)}.
	 */
	@Test
	void testFindSongByTitle() {
		s4 = new Song("0004","bad guy","Billie Eilish",3.14);
		sc.addSong(s4);
      Song songFound = sc.findSongByTitle("bad guy");
      Song songNotFound=sc.findSongByTitle(SONG_EIGHT_ID_NOT_EXIST);
  	assertEquals(s4,songFound.getArtiste());
  	assertNull(songNotFound);	
	}

}
