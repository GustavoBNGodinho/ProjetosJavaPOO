package ExemplosPoo.MediaPlayer;

/**
 * Classe que representa uma faixa.
 */
public class Track {
    String title;
    String artist;
    String album;
    int year;
    Duration duration;

    /**
     * Construtor da classe Track.
     * @param title O titulo da faixa.
     * @param artist O artista que está vinculada a música.
     * @param album O album em que consta a faixa.
     * @param year O ano de lançamento da faixa.
     * @param duration A duração da música.
     */

    Track(String title, String artist, String album, int year, Duration duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.duration = duration;
    }

    /**
     * Retorna a duração dá faixa
     * @return Duração da faixa
     */
    Duration getDuration() {
        return duration;
    }

    /**
     * Retorna os parametros da Track organizados em uma String.
     * @return Formato String do Track.
     */
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Album: " + album + "\n" +
                "Release year: " + year + "\n" +
                "Duration: " + duration + "\n";
    }

//    public static void main(String[] args) {
//        Track track = new Track("Bohemian Rhapsody", "Queen", "A Night at the Opera", 1975, new Duration(555));
//        System.out.println(track);
//    }
}

