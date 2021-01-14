import java.util.Scanner;
public class Colour {
    public static String colour() {git
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the colour.");
            String letter = scanner.nextLine().trim().toLowerCase();
            switch (letter) {
                case "w":
                    return "white";
                case "b":
                    return "black";
                case "g":
                    return "green";
                case "y":
                    return "yellow";
                case "p":
                    return "purple";
                default:
                    System.out.println("Select different letter.");
            }
        }
    }
}
