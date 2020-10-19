public class CoordinateSystem {
    public static void main(String[] args) {
        PointCreator pointCreator = new PointCreator();
        CheckPoint checkPoint = new CheckPoint();
        checkPoint.checkPointOnCoordinateSystem(pointCreator.create());
    }
}
