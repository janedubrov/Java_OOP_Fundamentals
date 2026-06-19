package exceptions.score;

public class InvalidScoreException extends Exception {

    private int score;

    public InvalidScoreException(String message, int score) {
        super(message);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
