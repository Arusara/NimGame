import java.util.Scanner;

public class NimGame {

    public int pileSize = (int) (Math.random()*(100-10+1)) + 10;

    public int computerOrHuman = (int) (1 * Math.random());

    public int computerMode = (int) (1 * Math.random());


    public int getPileSize() {
        return pileSize;
    }

    public int getComputerMode() {
        return computerMode;
    }

    public int getComputerOrHuman() {
        return computerOrHuman;
    }



}
