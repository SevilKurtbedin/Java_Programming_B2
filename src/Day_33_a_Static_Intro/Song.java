package Day_33_a_Static_Intro;

public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song (String name) {
        this.name = name;
    }

    public Song (String name, double length) {
        this (name);
        this.length = length;
    }

    public Song (String name, double length, String artist) {
        this(name, length);
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
        this (name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song: " +
                "\n\tName: " + name +
                "\n\tLength: " + (length != 0.0 ? length: "There is not length for this object") +
                "\n\tArtist:" + artist  +
                "\n\tGenre: " + genre;
    }
}
