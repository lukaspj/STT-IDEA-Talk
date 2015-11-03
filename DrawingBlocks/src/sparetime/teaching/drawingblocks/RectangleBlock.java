package sparetime.teaching.drawingblocks;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Lukas on 03-11-2015.
 */
public class RectangleBlock implements DrawBlock {

    private Vector2 _position;
    private double _width;
    private double _height;

    public RectangleBlock(Vector2 position, double width, double height) {
        _position = position;
        _width = width;
        _height = height;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.strokeRect(_position.getX() - (_width*0.5), _position.getY() - (_height*0.5), _width, _height);
    }
}
