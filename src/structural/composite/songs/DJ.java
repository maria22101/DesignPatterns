package structural.composite.songs;

public class DJ {
    SongComponent songList;

    public DJ(SongComponent songList) {
        this.songList = songList;
    }

    public void getSongList() {
        songList.displaySongInfo();
    }
}
