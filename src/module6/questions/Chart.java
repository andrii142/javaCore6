package module6.questions;

import java.util.Random;

/**
 * Created by citsym on 06.03.17.
 */
public class Chart {

    private Random random = new Random();

    private Point[] points = new Point[10];

    public void init() {
        for (int i = 0; i < 10; i++) {
            points[i] = new Point(random.nextInt(100), random.nextInt(100), i);
        }

    }


    public void drawChart() {

        for (Point point : points) {
            System.out.println(point);
        }
    }

    public int calculateWidthOfChart() {
        int width = 0;

        for (Point point : points) {
            width += point.getDistanceToNextPoint();
        }

        return width;
    }


    private class Point {

        private int order;
        private int x;
        private int y;
        private int distanceToNextPoint;

        public Point(int x, int y, int order) {
            this.x = x;
            this.y = y;
            this.order = order;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public int getDistanceToNextPoint() {
            calculateDistance();
            return distanceToNextPoint;
        }

        private void calculateDistance() {
            if (order == points.length - 1) {
                return;
            }
            distanceToNextPoint = x + points[order + 1].getX();
        }
    }

}
