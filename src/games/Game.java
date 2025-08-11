package games;

class Game {
    String gameName = "Chess";
    int gameId = 404;
    String gameType = "Board";

    void showGameDetails() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Game ID: " + gameId);
        System.out.println("Game Type: " + gameType);
    }
}
