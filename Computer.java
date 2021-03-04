public class Computer {




    public int smartMove(int pileSize) {

        // (2^n)-1 in smart move.
        int choice = 0;
        double n = Math.floor(Math.log(pileSize) / Math.log(2));
        double desirePile = Math.pow(2, n) - 1;//find desire pile
        int intDesire = (int) Math.round(desirePile);//convert double to int

        if (!(pileSize == desirePile)) {
            choice = pileSize - intDesire;//find choice
            System.out.println("No of marbles picked:" + choice + "marble(S)");
        }
        pileSize = pileSize - choice;//find marbles left
        return pileSize;
    }

    public int stupidMove(int pileSize) {

        //random choice 1 to n/2 in stupid mode.
        int stupidChoice = (int) (Math.random() * pileSize * 0.5) + 1;
        pileSize = pileSize - stupidChoice;
        return pileSize;
    }



}
