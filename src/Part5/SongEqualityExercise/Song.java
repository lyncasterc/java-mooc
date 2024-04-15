package Part5.SongEqualityExercise;


import java.util.Objects;

public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return durationInSeconds == song.durationInSeconds && Objects.equals(artist, song.artist) && Objects.equals(name, song.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, name, durationInSeconds);
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}