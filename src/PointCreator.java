import java.util.Scanner;

public class PointCreator {
    Point create() {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();

        System.out.println("Podaj punkt X: ");
        point.setX(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Podaj punkt Y: ");
        point.setY(scanner.nextInt());

        return point;
    }
}
