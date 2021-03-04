import java.util.Scanner;

public class NimGameMain {


    public static void main(String[] arg) {

        // creating objects.
        NimGame nimGame = new NimGame();
        Computer computer = new Computer();
        Human human = new Human();
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------welcome to NIM GAME-----------");
        System.out.println("The pile Size : "+nimGame.pileSize);

        // computer 0.
        // human 1.
        if (nimGame.computerOrHuman ==0) {
            System.out.println("computer is making first move");
        } else {
            System.out.println("human is making first move");
        }

        // computer mode.
        // stupid mode 0
        // smart mode 1.
        if (nimGame.computerMode == 0) {
            System.out.println("Computer is playing in stupid mode");
        } else {
            System.out.println("Computer is playing in smart mode");
        }



        while(true) {

            if (nimGame.pileSize<=0) {
                System.out.println("---The GAME is OVER----");
                break;
            } else {
                if (nimGame.computerOrHuman == 0) {
                    // computer first move.
                    if (nimGame.computerMode == 0) {
                        //random choice 1 to n/2 in stupid mode.
                        nimGame.pileSize = computer.stupidMove(nimGame.pileSize);
                        if (nimGame.pileSize ==1) {
                            System.out.println("Computer Wins");
                            break;
                        }

                    } else {
                        // (2^n)-1 in smart move.
                        nimGame.pileSize = computer.smartMove(nimGame.pileSize);
                        if (nimGame.pileSize == 1) {
                            System.out.println("Computer Wins");
                            break;
                        }
                    }

                    System.out.println("---Human turn---");
                    System.out.println("Remaining pile size "+nimGame.pileSize);
                    int number = human.getInputFromUser();
                    nimGame.pileSize = nimGame.pileSize - number;

                    if (nimGame.pileSize == 1) {
                        System.out.println("Human wins");
                        break;
                    }

                } else {
                    // human first move.
                    System.out.println("---Human turn---");
                    System.out.println("Remaining pile size "+nimGame.pileSize);
                    int number = human.getInputFromUser();
                    nimGame.pileSize = nimGame.pileSize - number;

                    if (nimGame.pileSize == 1) {
                        System.out.println("Human wins");
                        break;
                    }

                    if (nimGame.computerMode == 0) {
                        nimGame.pileSize = computer.stupidMove(nimGame.pileSize);
                        if (nimGame.pileSize ==1) {
                            System.out.println("computer wins");
                            break;
                        }

                    } else {
                        // (2^n)-1 in smart move.
                        nimGame.pileSize = computer.smartMove(nimGame.pileSize);
                        if (nimGame.pileSize == 1) {
                            System.out.println(" computer wins");
                            break;
                        }
                    }
                }
            }
        }
    }
}
