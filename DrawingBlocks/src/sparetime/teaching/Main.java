package sparetime.teaching;

import sparetime.teaching.drawingblocks.FigureDisplay;
import sparetime.teaching.drawingblocks.RectangleBlock;
import sparetime.teaching.drawingblocks.Vector2;

/**
 * Created by Lukas on 03-11-2015.
 */
public class Main {
    public static void main(String[] args) {
        new FigureDisplay(new RectangleBlock(new Vector2(400.0,300.0),200.0,200.0));
    }
}
