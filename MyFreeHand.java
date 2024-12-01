package paintDM;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class MyFreeHand extends MyShape {
    private ArrayList<Point> points;

    public MyFreeHand(Color color) {
        super(0, 0, 0, 0, color); // Initial coordinates are not used but required by MyShape constructor
        points = new ArrayList<>();
    }

    public void addPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
    }
}
