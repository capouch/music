public class MusicDriver {
   public static void main(String[] args) {
	Music myMusic = new Music();
	System.out.println(myMusic.toString());
	Music anotherMusic = new Music("Back in Black", "AC/DC", "Metal", "CD");
	System.out.println(anotherMusic.toString());
	System.out.println(anotherMusic.getAlbum());
        }
  }
