package behavioral.memento.game;

public class Game {
    private String level;
    private int ms;

    public void set(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public void recoverSavedGame(SavedGame savedGame) {
        level = savedGame.getLevel();
        ms = savedGame.getMs();
    }

    public SavedGame saveGame() {
        return new SavedGame(level, ms);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}
