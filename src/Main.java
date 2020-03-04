import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("You are in a land full of dragons. In front of you,\n" +
            "\n" +
            "you see two caves. In one cave, the dragon is friendly\n" +
            "\n" +
            "and will share his treasure with you. The other dragon\n" +
            "\n" +
            "is greedy and hungry and will eat you on sight.\n" +
            "\n" +
            "Which cave will you go into? (1 or 2)");

    int cave = input.nextInt();

    if (cave == 1){
        System.out.print("You approach the cave...\n" +
                "\n" +
                "It is dark and spooky...\n" +
                "\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "\n" +
                "Gobbles you down in one bite!");

    }
    else if (cave == 2){
        System.out.print("A Dragon sees you and greets you.\n"
                +"You are given the treasure.");
    }

}
}
