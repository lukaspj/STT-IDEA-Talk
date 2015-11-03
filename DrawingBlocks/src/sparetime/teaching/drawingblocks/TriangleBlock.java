package sparetime.teaching.drawingblocks;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Lukas on 03-11-2015.
 */
public class TriangleBlock implements DrawBlock {

    private Vector2 _position;
    private Vector2 _p1;
    private Vector2 _p2;
    private Vector2 _p3;

    public TriangleBlock(Vector2 position,
                         Vector2 p1,
                         Vector2 p2,
                         Vector2 p3) {
        _position = position;
        _p1 = p1;
        _p2 = p2;
        _p3 = p3;
    }

    @Override
    public void draw(GraphicsContext context) {
        double[] xCoords = new double[] {
                _p1.getX() + _position.getX(),
                _p2.getX() + _position.getX(),
                _p3.getX() + _position.getX()
        };
        double[] yCoords = new double[] {
                _p1.getY() + _position.getY(),
                _p2.getY() + _position.getY(),
                _p3.getY() + _position.getY()
        };
        context.strokePolygon(xCoords, yCoords, 3);
    }
}
