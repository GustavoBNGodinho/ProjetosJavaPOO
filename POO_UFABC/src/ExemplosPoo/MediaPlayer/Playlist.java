package ExemplosPoo.MediaPlayer;

import java.util.ArrayList;

public class Playlist {
    private String title;
    Duration duration;
    ArrayList<Track> playlist;

    Playlist(String title) {
       playlist = new ArrayList<Track>();
       this.title = title;
       duration = new Duration(0);
    }

    void addTrack(Track track) {
        playlist.add(track);
    }

    String getTitle() {
        return title;
    }
    ArrayList<Track> getPlaylist() {
        return playlist;
    }

    Duration getDuration() {
        for (Track track : playlist) {
            duration = duration.add(track.getDuration());
        }
        return this.duration;
    }
    int getNumberOfTracks() {
        return playlist.size();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Track track : playlist) {
            stringBuilder.append(track.toString());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist("Top 2 Hits Ever");

        playlist.addTrack(new Track("Bohemian Rhapsody", "Queen", "A Night at the Opera", 1975, new Duration(555)));
        playlist.addTrack(new Track("Imagine", "John Lennon", "Imagine", 1971, new Duration(217)));

        System.out.println(playlist);
    }
}

