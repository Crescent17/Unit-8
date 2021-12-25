import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song :
                songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber >= songs.size() + 1) {
            return false;
        }
        playlist.add(songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
        if (findSong(title) == null) {
            return false;
        }
        playlist.add(findSong(title));
        return true;
    }
}
