public class Music {
  
  // Class to keep track of music
  // CMP112 Brian Capouch 13 February 2015

  public String album;
  public String artist;
  public String genre;
  public String media;
  public String location;
  public int copies;

/* ----------------------------------------------------------------------- */

  Music() {
    album = "No album";
    artist = "No arist";
    genre = "No genre";
    media = "None";
    location = "Nowhere";
    copies = 1;
    }

  Music(String thisAlbum, String thisArtist, String thisGenre, String thisMedia) {
    this();
    album = thisAlbum;
    artist = thisArtist;
    genre = thisGenre;
    media = thisMedia;
    }   
	
  public String getAlbum() {
    return album;
    }

  public String toString() {
    String output = "";
    output = "Album: " + album + " Artist: " + artist + " Genre: " + genre + " Media: " + media + " Location: " + location + " Copies: " + copies;
    return output;
    }

}
