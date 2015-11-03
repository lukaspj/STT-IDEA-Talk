package sparetime.teaching.drawingblocks;

/**
 * Created by Lukas on 03-11-2015.
 */
public class Vector2 {
    private double _x;
    private double _y;

    public Vector2(double x, double y) {
        _x = x;
        _y = y;
    }

    public Vector2 add(Vector2 p2) {
        return new Vector2(_x + p2.getX(), _y + p2.getY());
    }

    public Vector2 subtract(Vector2 p2) {
        return new Vector2(_x - p2.getX(), _y - p2.getY());
    }

    public Vector2 scale(double val) {
        return new Vector2(_x * val, _y * val);
    }

    public double getX() {
        return _x;
    }

    public double getY() {
        return _y;
    }
}
