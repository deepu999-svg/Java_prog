package deepuu;
import java.util.Scanner;

public class RGB {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the RGB string: ");
        String input = s.nextLine().toUpperCase();

        if (containsInvalidPairs(input)) {
            System.out.println("Blackandwhite");
        } else {
            System.out.println("Colourful");
        }

        s.close();
    }

    private static boolean containsInvalidPairs(String input) {
        String[] invalidPairs = {"RBG", "RGB", "GBR", "GRB", "BRG", "BGR"};
        for (String pair : invalidPairs) {
            if (input.contains(pair)) {
                return true;
            }
        }
        return false;
    }
}


