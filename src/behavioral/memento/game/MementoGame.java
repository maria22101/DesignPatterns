package behavioral.memento.game;

public class MementoGame {

    public static void main(String[] args) {

        //game has started
        Game game = new Game();
        game.set("level_1", 30000);
        System.out.println(game);

        //we want to save our game
        File file = new File(); //caretaker
        SavedGame level_1 = game.saveGame(); //memento
        file.setSavedGame(level_1);

        //we keep on playing
        game.set("level_2", 85000);
        System.out.println(game);

        //something went wrong and we want to resume our level_1
        SavedGame level_1_fromCaretaker = file.getSavedGame();
        game.recoverSavedGame(level_1_fromCaretaker);
        System.out.println("Recovered game form caretaker: " + game);
    }
}
