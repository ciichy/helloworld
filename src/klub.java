import java.util.Scanner;

public class klub {

    public static void main(String[] args) {
        System.out.println("Czesc, jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "ile masz lat");
        int age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("OK, zapraszam na loze " + name);
        } else {
            System.out.println("Niestety " + name + "nie wejdziesz");
        }
    }
}
