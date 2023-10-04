import java.util.Scanner;

public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // gets first coordinate as string
        System.out.println("Enter First Pair of Coordinate: ");
        String temString = s.nextLine();
        int indexOfComma = temString.indexOf(",");
        // gets numbers from the string
        String temX = temString.substring(1, indexOfComma);
        String temY = temString.substring(indexOfComma + 1, temString.length() - 1);
        int x1 = Integer.parseInt(temX);
        int y1 = Integer.parseInt(temY);

        // gets first coordinate as string
        System.out.println("Enter Second Pair of Coordinate: ");
        temString = s.nextLine();
        indexOfComma = temString.indexOf(",");
        // gets numbers from the string
        temX = temString.substring(1, indexOfComma);
        temY = temString.substring(indexOfComma + 1, temString.length() - 1);
        int x2 = Integer.parseInt(temX);
        int y2 = Integer.parseInt(temY);

        // creates an instance of the LinearEquation Class
        LinearEquation equation1 = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation1);

        System.out.println("Enter A Third x-value: ");
        temString = s.nextLine();
        double thirdX = Double.parseDouble(temString);
        System.out.println(equation1.calculateCoordinate(thirdX));

    }
}
