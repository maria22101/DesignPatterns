package structural.composite.songs;

public class SongsListGenerator {

    public static void main(String[] args) {
        SongComponent loungeMusic = new SongGroup(
                "\"Lounge\"", "Music for relaxation");

        SongComponent rockMusic = new SongGroup(
                "\"Rock\"","Highly energetic music");

        SongComponent discoMusic = new SongGroup(
                "\"Disco\"","Dancing music originated from 80s");

        //top level song component
        SongComponent topSongGroup = new SongGroup(
                "\"Songs List\"", "All songs and song groups available here");
        topSongGroup.add(loungeMusic);
        topSongGroup.add(rockMusic);
        topSongGroup.add(discoMusic);

        loungeMusic.add(new Song("\"Chilling wave\"", "Ozons", 2018));
        loungeMusic.add(new Song("\"Soft sand\"", "Sirenas", 2019));
        rockMusic.add(new Song("\"Rock you\"", "ASSC", 1985));
        discoMusic.add(new Song("\"Move it\"", "Strikers", 1989));

        SongComponent chillMusic = new SongGroup(
                "\"Chill\"", "Music for relaxed state and meditation");

        loungeMusic.add(chillMusic);

        DJ dj = new DJ(topSongGroup);
        dj.getSongList();
    }
}
