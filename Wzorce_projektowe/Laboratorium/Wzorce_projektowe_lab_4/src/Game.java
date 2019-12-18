abstract class Game {
    public final void run(){
        initialize();
        while(!gameOver()){
            makeMoves();
            paintScreen();
        }
        onEnd();
    }

    protected abstract boolean gameOver();

    protected abstract void onEnd();

    protected abstract void paintScreen();

    protected abstract void makeMoves();

    protected abstract void initialize();


}
