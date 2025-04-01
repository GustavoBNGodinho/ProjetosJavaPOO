package ExemplosPoo.MediaPlayer;

import java.util.ArrayList;

public class Player {
    ArrayList<Track> listaDeReprodução;
    Track currentTrack;

    Player() {
        listaDeReprodução = new ArrayList<Track>();
        currentTrack = null;
    }

    void addPlaylist(Playlist playlist) {
        for (Track track : playlist.getPlaylist()) {
            listaDeReprodução.add(track);
        }
        currentTrack = playlist.getPlaylist().get(0);
    }

    void playNext() {
        if (listaDeReprodução.size() == 0) {
            throw new IllegalStateException("Não a Faixas na lista de reprodução");
        }
        int index = listaDeReprodução.indexOf(currentTrack);
        index++;

        currentTrack = listaDeReprodução.get(index);
    }

    public static void main(String[] args) {
        Player player = new Player();
//        player.addPlaylist();
    }
}
