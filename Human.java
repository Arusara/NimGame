import java.util.Scanner;

public class Human {

    Scanner scan = new Scanner(System.in);


    public int getInputFromUser() {

        System.out.println("How many marbles do you want to pick?");
        int number = scan.nextInt();
        while(number<1){
            System.out.println("Error. Please re-enter a valid value");
            number = scan.nextInt();
        }
        System.out.println ("You picked : "+ number + "Piles");
        return number;
    }
}
