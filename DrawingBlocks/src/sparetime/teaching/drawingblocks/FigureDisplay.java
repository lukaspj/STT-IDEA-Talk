package sparetime.teaching.drawingblocks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by Lukas on 03-11-2015.
 */
public class FigureDisplay extends Application {
    private static final int _width = 800;
    private static final int _height = 600;
    private static DrawBlock _block = null;

    public FigureDisplay() {
    }

    public FigureDisplay(DrawBlock block) {
        _block = block;
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        if(_block == null)
            return;
        final Canvas drawCanvas = new Canvas(_width, _height);
        final GraphicsContext drawContext = drawCanvas.getGraphicsContext2D();
        drawContext.setLineWidth(5);
        drawContext.setFill(Color.BLACK);
        drawContext.setStroke(Color.BLACK);
        _block.draw(drawContext);

        final Pane root = new VBox();
        root.getChildren().add(drawCanvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
