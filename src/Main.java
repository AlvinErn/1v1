import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random randomGernerator = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to GOAT vs WOAT");

        // Contains the stats of the first character
        ArrayList<Integer> stats1 = new ArrayList<>();
        stats1.add(100);
        stats1.add(randomGernerator.nextInt(20, 101));
        stats1.add(randomGernerator.nextInt(3, 51));

        // Contains the stats of the second character
        ArrayList<Integer> stats2 = new ArrayList<>();
        stats2.add(100);
        stats2.add(randomGernerator.nextInt(20, 101));
        stats2.add(randomGernerator.nextInt(3, 51));

        System.out.println("Charcter 1 has " + stats1.get(1) + " mana and " + stats1.get(0) + " HP");
        System.out.println("Charcter 2 has " + stats2.get(1) + " mana and " + stats2.get(0) + " HP");

        int newHP = standardAttack(stats1.get(2), stats2.get(0));
        stats2.set(0, newHP);
        System.out.println("Fighter number 2 now has " + stats2.get(0) + " HP");

        specialAttack(stats1.get(2), stats1.get(1), stats2.get(0));
    }

    // Method for standard attack
    public static int standardAttack(int damage, int hp) {
        int chance = randomGernerator.nextInt(101); // Generates a number 0-99

        //
        if (chance > 75) {
            hp = hp - damage / 6;
            System.out.println("Regular hit");
        } else {
            hp = hp - damage;
            System.out.println("Critical hit");
        }
        return hp;

    }

    // Method for special attack (costs mana)
    public static int specialAttack(int damage, int mana, int hp) {

        hp = (int) (hp - 0.25 * damage);
        mana -= 20; // Removes 20 mana for using special attack
        return hp;
    }

    // Method for special attack

}
//   System.out.println("första"); // Skriver ut och skapar ny rad
//   System.out.print("andra"); // Skriver ut utan att avsluta med ny rad
//   System.out.print("tredje");
