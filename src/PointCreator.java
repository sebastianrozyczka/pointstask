import java.util.Scanner;

public class PointCreator {
    public Point create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj punkt X: ");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj punkt Y: ");
        int y = scanner.nextInt();

        Point point = new Point(x, y);
        return point;
    }
}
