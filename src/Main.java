import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordMatch w = new WordMatch("concatenation");
        System.out.println(w.scoreGuess("ten"));
        System.out.println(w.scoreGuess("nation"));
        System.out.println(w.findBetterGuess("ten", "nation"));
        System.out.println(w.scoreGuess("con"));
        System.out.println(w.scoreGuess("cat"));
        System.out.println(w.findBetterGuess("con", "cat"));
        System.out.println(read());
    }
    public static int read() throws FileNotFoundException{
        File a = new File("Geusses.txt");
        Scanner b = new Scanner(a);
        int guess1;
        int guess2;
        int num = 0;
        while (b.hasNext()){
            WordMatch c = new WordMatch(b.next());
            num += c.scoreGuess(c.findBetterGuess(b.next(), b.next()));
        }
        return num;
    }

}
