package sparetime.teaching.drawingblocks;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Lukas on 03-11-2015.
 */
public class CircleBlock implements DrawBlock {

    private Vector2 _position;
    private double _radius;

    public CircleBlock(Vector2 position, double radius) {
        _position = position;
        _radius = radius;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.strokeOval(_position.getX(), _position.getY(), _radius, _radius);
    }
}
