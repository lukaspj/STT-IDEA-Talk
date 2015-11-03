package sparetime.teaching.drawingblocks;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Lukas on 03-11-2015.
 */
public class OvalBlock implements DrawBlock {

    private Vector2 _position;
    private double _width;
    private double _height;

    public OvalBlock(Vector2 position, double width, double height) {
        _position = position;
        _width = width;
        _height = height;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.strokeOval(_position.getX(), _position.getY(), _width, _height);
    }
}
