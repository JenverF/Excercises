package com.pluralsight.week1;

public class StaticMethods {
    static void main(String[] args) {
        printWelcome();
        displayPlayerName("Shrimpturtle");
        showLevel(67);
        showLevel(41);
        attack("Shrimpturtle", "Jackson");
        attack("Jackson", "Shrimpturtle");
        foundItem("Shrimpturtle", "sword");
        foundItem("Shrimpturtle", "shield");
        foundItem("Shrimpturtle", "pizza");
        castSpell("Ryland", "Fireball", 420);
        castSpell("Ryland", "Heal", 200);
        displayInventory("Shrimpturtle", 32);
        enterDungeon("Jackson", "Heart of the Volcano");
        enterDungeon("Jacob", "Bowser's Castle");
        victoryDance("Shrimpturtle");
        gameOver("Shrimpturtle");
    }
    public static void printWelcome() {
        System.out.println("Welcome to Code Quest!");
    }
    public static void displayPlayerName(String playerName) {
        System.out.println("Player joined: " + playerName);
    }
    public static void showLevel(int level) {
        System.out.println("Level: " + level);
    }
    public static void attack(String attacker, String target) {
        System.out.println(attacker + " attacks " + target + "!");
    }
    public static void foundItem(String player, String item) {
        System.out.println(player + " found a " + item + "!");
    }
    public static void castSpell(String wizard, String spellName, int manaCost) {
        System.out.println(wizard + " casts " + spellName + " costing " + manaCost + "!");
    }
    public static void gameOver(String player) {
        System.out.println("GAME OVER for " + player + "!");
    }
    public static void displayInventory(String player, int itemCount) {
        System.out.println(player + " has " + itemCount + " items in his inventory.");
    }
    public static void enterDungeon(String player, String dungeonName) {
        System.out.println(player + " bravely enters the " + dungeonName + ".");
    }
    public static void victoryDance(String player) {
        System.out.println(player + " does a little victory dance!");
    }
}
