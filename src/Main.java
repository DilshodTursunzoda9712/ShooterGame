import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player = new Player();
        System.out.format("\nУ игрока  слотов с оружием," +
                " введите номер ,чтобы выстрелить ," +
                " -1 чтобы выйти%n" + "\n0.Pistol shot !\n1.Shot RPG !" +
                "\n2.Shot Slingshot !\n3.Shot Machine Gun !\n4.Shot Water Gun !\n5.Rifle shot !\n"
                + player.getSlotsCount() + "\n");
        int slot;
        do {
            slot = scan.nextInt();
            if (slot == -1) {
                break;
            }
            player.shotWithwWapon(slot);
        } while (1 != 0);
        System.out.println("Game Over!");

    }
}