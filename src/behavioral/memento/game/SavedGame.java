package behavioral.memento.game;

public class SavedGame {
    private String level;
    private int ms;

    public SavedGame(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public String getLevel() {
        return level;
    }

    public int getMs() {
        return ms;
    }
}
