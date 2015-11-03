package sparetime.teaching.drawingblocks;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by Lukas on 03-11-2015.
 */
public class LineBlock implements DrawBlock {

    private Vector2 _position, _p1, _p2;

    public LineBlock(Vector2 position, Vector2 p1, Vector2 p2) {
        _position = position;
        _p1 = p1;
        _p2 = p2;
    }

    @Override
    public void draw(GraphicsContext context) {
        Vector2 displacedP1 = _position.add(_p1);
        Vector2 displacedP2 = _position.add(_p2);
        context.strokeLine( displacedP1.getX(), displacedP1.getY(),
                            displacedP2.getX(), displacedP2.getY());
    }
}
