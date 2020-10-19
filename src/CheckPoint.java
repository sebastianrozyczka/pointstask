public class CheckPoint {
    void checkPointOnCoordinateSystem(Point point) {
        String pointCoordinates = "Punkt " +"(" + point.getX() + ", " + point.getY()+ ")";
        if(point.getX() > 0 && point.getY() > 0)
            System.out.println(pointCoordinates + " znajduje się w I ćwiartce");
        else if(point.getX() < 0 && point.getY() > 0)
            System.out.println(pointCoordinates + " znajduje się w II ćwiartce");
        else if(point.getX() < 0 && point.getY() < 0)
            System.out.println(pointCoordinates + " znajduje się w III ćwiartce");
        else if(point.getX() > 0 && point.getY() < 0)
            System.out.println(pointCoordinates + " znajduje się w IV ćwiartce");
        else
            System.out.println("Punkt znajduje się na jednej z linii układu współrzędnych");
    }
}
